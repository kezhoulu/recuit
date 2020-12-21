package com.recuit.interceptor;

import com.recuit.model.UserModel;
import com.recuit.util.SpringSecurityUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * mybatis拦截器，对用户查看置为模块进行权限控制
 */
@Intercepts({ @Signature(type = StatementHandler.class, args = { Connection.class }, method = "prepare") })
public class RightInterceptor implements Interceptor {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        StatementHandler handler = (StatementHandler) invocation.getTarget();
        BoundSql boundSql = handler.getBoundSql();
        Object paramter = boundSql.getParameterObject();
        if (paramter instanceof Map) {
            Map<String, Object> paramMap = (Map<String, Object>) paramter;
            if (paramMap.containsKey("filterRight")
                    && (boolean) paramMap.get("filterRight")) {
                String sql = boundSql.getSql();
                StringBuffer whereSql = new StringBuffer();
                UserModel userModel = SpringSecurityUtil.currentUser();
                if(userModel!=null
                        && StringUtils.contains(userModel.getRight(),"COMPANY")){
                     if(StringUtils.contains(sql,"WHERE") || StringUtils.contains(sql,"where")){
                        whereSql.append(" and").append(" c_ssgs='").append(userModel.getId()).append("'");
                    }else{
                         whereSql.append(" where").append(" c_ssgs='").append(userModel.getId()).append("'");
                     }
                     if(StringUtils.contains(sql,"LIMIT ?")){
                         sql = sql.replace("LIMIT ?",whereSql.toString()+" order by c_id limit ?");
                     }else if(StringUtils.contains(sql,"LIMIT ? OFFSET ?")){
                         sql = sql.replace("LIMIT ? OFFSET ?",whereSql.toString()+" order by c_id limit ? offset ?");
                    }else{
                         sql = sql + whereSql.toString();
                     }
                }


                try {
                    FieldUtils.writeField(boundSql, "sql", sql, true);
                } catch (IllegalAccessException e) {
                    logger.error("【" + sql + "】修改错误", e);
                }
            }
        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}

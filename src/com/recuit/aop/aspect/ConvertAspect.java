package com.recuit.aop.aspect;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.recuit.aop.annotation.CodeConvert;
import com.recuit.aop.annotation.DateConvert;
import com.recuit.aop.annotation.UserConvert;
import com.recuit.cache.CodeCache;
import com.recuit.cache.UserCache;
import com.recuit.model.CodeModel;
import com.recuit.model.UserModel;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




@Aspect
@Component
public class ConvertAspect {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	/**
	 * user缓存类
	 */
	@Autowired
	private UserCache userCache;

	/**
	 * code单值代码缓存类
	 */
	@Autowired
	private CodeCache codeCache;

	/** 切入点 **/
	@Pointcut("@annotation(com.recuit.aop.annotation.Convert)")
	public void businessConvertAnnoAspect() {

	}

	@Around("businessConvertAnnoAspect()")
	public Object convertAround(ProceedingJoinPoint joinPoint) {
		Object obj = null;
		try {
			obj = joinPoint.proceed();
		} catch (Throwable e) {
			log.error("aop中方法执行失败", e.getMessage());
		}
		if(obj != null ) {
			if( obj instanceof List) {
				List result = (List)obj;
				for(Object o : result) {
					translate(o.getClass(), o);
				}
			}else {
				translate(obj.getClass(), obj);
			}
		}
		return obj;
	}

	public void translate(Class clazz, Object obj) {
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			DateConvert dateAnn = field.getAnnotation(DateConvert.class);
			resolveDate(dateAnn, field, obj, fields);
			CodeConvert codeAnn = field.getAnnotation(CodeConvert.class);
			resolveCode(codeAnn, field, obj, fields);
			UserConvert userAnn = field.getAnnotation(UserConvert.class);
			resolveUser(userAnn, field, obj, fields);
		}
	}

	private void resolveUser(UserConvert userAnn, Field field, Object obj, Field[] fields) {
		if (userAnn != null) {
			field.setAccessible(true);
			String oldValue = null;
			String newValue = null;
			try {
				oldValue = (String) field.get(obj);
				UserModel user = userCache.getUserCache(oldValue);
				newValue = user == null ? null : user.getUserNameCn();
			} catch (IllegalArgumentException | IllegalAccessException e) {
				log.error("获取原始值失败", e.getMessage());
			}
			if (newValue != null) {
				try {
					field.set(obj, newValue);
				} catch (IllegalArgumentException e) {
					log.error("单值代码转换后塞值失败", e.getMessage());
				} catch (IllegalAccessException e) {
					log.error("单值代码转换后塞值失败", e.getMessage());
				}
			}
		}
	}



	private void resolveCode(CodeConvert codeAnn, Field field, Object obj, Field[] fields) {
		if (codeAnn != null) {
			String pid = codeAnn.pid();
			field.setAccessible(true);
			String oldValue = null;
			CodeModel codeModel = null;
			try {
				oldValue = (String) field.get(obj);
				codeModel = codeCache.getCodeCache(pid,oldValue);
			} catch (IllegalArgumentException e) {
				log.error("获取原始值失败", e.getMessage());
			} catch (IllegalAccessException e) {
				log.error("获取原始值失败", e.getMessage());
			}
			if (codeModel !=null && StringUtils.isNotBlank(codeModel.getCodeName())) {
				try {
					field.set(obj, codeModel.getCodeName());
				} catch (IllegalArgumentException e) {
					log.error("单值代码转换后塞值失败", e.getMessage());
				} catch (IllegalAccessException e) {
					log.error("单值代码转换后塞值失败", e.getMessage());
				}
			}
		}
	}


	public void resolveDate(DateConvert ann, Field field, Object obj, Field[] fields) {
		if (ann != null) {
			String fieldName = ann.format();
			Date date = null;
			field.setAccessible(true);
			try {
				date = (Date) field.get(obj);
			} catch (IllegalArgumentException e) {
				log.error("获取原始值失败", e.getMessage());
			} catch (IllegalAccessException e) {
				log.error("获取原始值失败", e.getMessage());
			}
		}
	}

}

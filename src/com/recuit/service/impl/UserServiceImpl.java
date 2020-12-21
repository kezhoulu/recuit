package com.recuit.service.impl;

import com.github.pagehelper.PageHelper;
import com.recuit.aop.annotation.Convert;
import com.recuit.cache.UserCache;
import com.recuit.config.PropertyConfigUtil;
import com.recuit.mapper.UserMapper;
import com.recuit.model.UserModel;
import com.recuit.service.UserService;
import com.recuit.util.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserCache userCache;

    /**
     * 获取所有的用户信息
     *
     * @return
     */
    @Override
    @Convert
    public List<UserModel> getUserList(int pageNum, int pageSize, String username) {

        PageHelper.startPage(pageNum,pageSize);
        List<UserModel> userList = userMapper.getUserList(username);
        return userList;
    }

    /**
     * 根据用户id用户信息
     * @param id
     * @param edit
     * @return
     */
    @Override
    public UserModel getUserById(String id, boolean edit) {
        UserModel user = new UserModel();
        if(edit){
            user = userMapper.getUserById(id);
        }
        user.setEdit(edit);
        return user;
    }

    /**
     * 新建用户时的保存方法
     *
     * @param user
     */
    @Override
    public void saveUser(UserModel user) {
        userMapper.saveUser(user);
    }

    /**
     * 更新用户方法
     *
     * @param user
     */
    @Override
    public void updateUser(UserModel user) {
        userMapper.updateUser(user);
    }

    @Override
    public UserModel getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }

    @Override
    public ModelAndView saveOrUpdateUser(UserModel user) {
        ModelAndView mv = new ModelAndView();
        try{
            if(user.getEdit()){ //编辑
                userMapper.updateUser(user);
            }else{  //保存
                UserModel userModel = userCache.getUserCache(user.getUserName());
                if(userModel!=null){
                    mv.addObject("message","该用户名已存在");
                    mv.setViewName("user-edit");
                    return mv;
                }
                user.setId(UUIDUtil.getUuid());
                userMapper.saveUser(user);
            }
            userCache.updateCache(user);
            mv.setViewName("redirect:/user/user-list.do?pageNum=1&pageSize=10&username=");
        }catch (Exception e){
            logger.error("保存或更新失败",e);
            mv.addObject("user",user);
            mv.setViewName("user-edit");
        }

        return mv;
    }

    @Override
    public ModelAndView register(String username, String password, String right) {
        ModelAndView mv = new ModelAndView();
        UserModel user = userCache.getUserCache(username);
        if(user!=null){ //用户已存在
            mv.addObject("message","用户已存在！");
            mv.setViewName("/register");
            return mv;
        }
        UserModel rUser = new UserModel();
        rUser.setId(UUIDUtil.getUuid());
        rUser.setUserName(username);
        rUser.setPassWord(password);
        rUser.setRight(right);
        rUser.setStatus("1");
        try{
            userMapper.saveUser(rUser);
        }catch(Exception e){
            logger.error("用户注册失败",e);
            mv.addObject("message","注册失败！");
            mv.setViewName("/register");
            return mv;
        }
        userCache.updateCache(rUser);
        mv.setViewName("/login");
        return mv;
    }

    @Override
    public UserModel updateSubmit(MultipartFile files , UserModel user) throws IOException {
        if(files!=null){
            String destFileName = files.getOriginalFilename();
            String destPath = PropertyConfigUtil.getProperty("file.path");
            String destFile = destPath+ File.separator+destFileName;
            //目前保存在本地，可迁移至ftp或minio
            files.transferTo(new File(destFile));
            user.setJlmc(destFileName);
            user.setJldz(destFile);
        }
        UserModel user1 = userMapper.getExtUserById(user.getId());
        if(user1 == null){
            user.setExtId(UUIDUtil.getUuid());
            userMapper.insertExtUser(user);
        }else{
            userMapper.updateExtUser(user);
        }
        return user;
    }

}

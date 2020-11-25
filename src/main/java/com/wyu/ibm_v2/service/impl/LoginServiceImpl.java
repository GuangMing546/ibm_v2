package com.wyu.ibm_v2.service.impl;


import com.wyu.ibm_v2.controller.LoginController;
import com.wyu.ibm_v2.mapper.ClassTeacherMapper;
import com.wyu.ibm_v2.mapper.LoginMapper;
import com.wyu.ibm_v2.service.LoginService;
import com.wyu.ibm_v2.util.LoginBean;
import com.wyu.ibm_v2.util.LoginResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    LoginMapper loginMapper;
    @Resource
    ClassTeacherMapper classTeacherMapper;

    //返回的数据是对象LoginResult：id，url，name
    @Override
    public LoginResult checkLogin(LoginBean loginBean) {
        String type=loginBean.getType();
        String userName=loginBean.getUserName();
        String password=loginBean.getPassword();

        System.out.println("用户类型："+type);
        System.out.println("用户名："+userName);
        System.out.println("密码:"+password);

        //设置返回的结果
        LoginResult loginResult=new LoginResult();
        loginResult.setUrl("false");

        String passwordFromDB;

        switch (type){
            case "管理员":
                loginBean=loginMapper.getAdminByUserName(userName);
                if(null==loginBean){
                    return loginResult;
                }
                passwordFromDB=loginBean.getPassword();
                if(passwordFromDB.equals(password)){
                    loginResult.setId(loginBean.getId());
                    loginResult.setName(loginBean.getName());
                    loginResult.setUrl("Admin");
                    return loginResult;
                }
                break;
            case "老师":
                loginBean=loginMapper.getTeacherByUserName(userName);
                if(null==loginBean){
                    return loginResult;
                }
                passwordFromDB=loginBean.getPassword();
                String teacherJod=loginBean.getTeacherJod();
                if(passwordFromDB.equals(password)){
                    if (teacherJod.equals("chinese")){
                        loginResult.setClassId(classTeacherMapper.getClassByChineseTeacherId(loginBean.getId()));
                    }
                    if (teacherJod.equals("math")){
                        loginResult.setClassId(classTeacherMapper.getClassByMathTeacherId(loginBean.getId()));
                    }
                    if (teacherJod.equals("english")){
                        loginResult.setClassId(classTeacherMapper.getClassByEnglishTeacherId(loginBean.getId()));
                    }
                    loginResult.setId(loginBean.getId());
                    loginResult.setName(loginBean.getName());
                    loginResult.setTeacherJod(loginBean.getTeacherJod());
                    loginResult.setUrl("Teacher");
                    return loginResult;
                }
                break;
            case "学生":
                loginBean=loginMapper.getStudentByUserName(userName);
                if(null==loginBean){
                    return loginResult;
                }
                passwordFromDB=loginBean.getPassword();
                if(passwordFromDB.equals(password)){
                    loginResult.setId(loginBean.getId());
                    loginResult.setName(loginBean.getName());
                    loginResult.setUrl("Student");
                    return loginResult;
                }
                break;
            default:

        }
        return loginResult;
    }
}

package com.wyu.ibm_v2.mapper;


import com.wyu.ibm_v2.util.LoginBean;

public interface LoginMapper {
    public LoginBean getAdminByUserName(String userName);
    public LoginBean getTeacherByUserName(String userName);
    public LoginBean getStudentByUserName(String userName);
}

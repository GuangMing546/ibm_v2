package com.wyu.ibm_v2.service;


import com.wyu.ibm_v2.util.LoginBean;
import com.wyu.ibm_v2.util.LoginResult;

public interface LoginService {
    public LoginResult checkLogin(LoginBean loginBean);
}

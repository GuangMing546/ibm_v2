package com.wyu.ibm_v2.controller;


import com.wyu.ibm_v2.service.impl.LoginServiceImpl;
import com.wyu.ibm_v2.util.LoginBean;
import com.wyu.ibm_v2.util.LoginResult;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/test")

//@Mapper

public class LoginController {
    @Autowired
//    @Resource
    LoginServiceImpl loginService;

    @PostMapping("/login")
    public LoginResult login(@RequestBody LoginBean loginBean){
        return loginService.checkLogin(loginBean);
    }
}

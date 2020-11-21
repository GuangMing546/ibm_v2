package com.wyu.ibm_v2.controller;


import com.wyu.ibm_v2.service.impl.LoginServiceImpl;
import com.wyu.ibm_v2.util.LoginBean;
import com.wyu.ibm_v2.util.LoginResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class LoginController {
    @Autowired
    LoginServiceImpl loginService;

    @PostMapping("/login")
    public LoginResult login(@RequestBody LoginBean loginBean){
        return loginService.checkLogin(loginBean);
    }
}

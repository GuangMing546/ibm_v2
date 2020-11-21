package com.wyu.ibm_v2.mapper;

import com.wyu.ibm_v2.entity.Admin;

public interface AdminMapper {
    //登录的时候用
    public Admin getAdminByUserName(String userName);
}

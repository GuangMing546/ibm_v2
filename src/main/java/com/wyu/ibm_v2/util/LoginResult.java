package com.wyu.ibm_v2.util;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class LoginResult {
    private String url;
    private String name;
    private Integer id; //原来修改密码的时候的依据凭证
    private Collection<String> classId; //如果是老师，它所管理的class有多少

    public Collection<String> getClassId() {
        return classId;
    }

    public void setClassId(Collection<String> classId) {
        this.classId = classId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

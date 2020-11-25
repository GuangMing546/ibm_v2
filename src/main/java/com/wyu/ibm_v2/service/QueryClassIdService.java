package com.wyu.ibm_v2.service;

import java.util.List;
import java.util.Set;

public interface QueryClassIdService {
    public List<String> queryClassIdForInsert(String teacherJod);
    public List<String> queryClassIdForUpdate(Integer id,String teacherJod);
}

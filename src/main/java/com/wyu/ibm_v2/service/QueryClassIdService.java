package com.wyu.ibm_v2.service;

import java.util.List;
import java.util.Set;

public interface QueryClassIdService {
    public Set<String> queryClassIdForInsert(String teacherJod);
    public Set<String> queryClassIdForUpdate(String teacherId,String teacherJod);
}

package com.wyu.ibm_v2.service.impl;

import com.wyu.ibm_v2.mapper.ClassTeacherMapper;
import com.wyu.ibm_v2.service.QueryClassIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Set;
@Service
public class QueryClassIdImpl implements QueryClassIdService {
    @Resource
    ClassTeacherMapper classTeacherMapper;
    @Override
    public Set<String> queryClassIdForInsert(String teacherJod) {
        Set<String> classId=null;
        if (teacherJod.equals("chinese")){
            classId=classTeacherMapper.getClassByChineseTeacherId("0");
            System.out.println(classId);
        }
        if (teacherJod.equals("math")){
            classId=classTeacherMapper.getClassByMathTeacherId("0");
        }
        if (teacherJod.equals("english")){
            classId=classTeacherMapper.getClassByEnglishTeacherId("0");
        }
        return classId;
    }

    @Override
    public Set<String> queryClassIdForUpdate(String teacherId,String teacherJod) {
        Set<String> classId=null;
        if (teacherJod.equals("chinese")){
            classId=classTeacherMapper.getEmptyClassToChineseUpdate(teacherId);
            System.out.println(classId);
        }
        if (teacherJod.equals("math")){
            classId=classTeacherMapper.getEmptyClassToMathUpdate(teacherId);
        }
        if (teacherJod.equals("english")){
            classId=classTeacherMapper.getEmptyClassToEnglishUpdate(teacherId);
        }
        return classId;
    }
}

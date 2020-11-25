package com.wyu.ibm_v2.service.impl;

import com.wyu.ibm_v2.mapper.ClassTeacherMapper;
import com.wyu.ibm_v2.service.QueryClassIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@Service
public class QueryClassIdServiceImpl implements QueryClassIdService {
    @Resource
    ClassTeacherMapper classTeacherMapper;
    @Override
    public List<String> queryClassIdForInsert(String teacherJod) {
        List<String> classId=null;
        if (teacherJod.equals("chinese")){
            classId=classTeacherMapper.getClassByChineseTeacherId(0);
            System.out.println(classId);
        }
        if (teacherJod.equals("math")){
            classId=classTeacherMapper.getClassByMathTeacherId(0);
            System.out.println(classId);
        }
        if (teacherJod.equals("english")){
            classId=classTeacherMapper.getClassByEnglishTeacherId(0);
            System.out.println(classId);
        }
        return classId;
    }

    @Override
    public List<String> queryClassIdForUpdate(Integer id,String teacherJod) {
        List<String> classId=null;
        if (teacherJod.equals("chinese")){
            classId=classTeacherMapper.getEmptyClassToChineseUpdate(id);
            System.out.println(classId);
        }
        if (teacherJod.equals("math")){
            classId=classTeacherMapper.getEmptyClassToMathUpdate(id);
        }
        if (teacherJod.equals("english")){
            classId=classTeacherMapper.getEmptyClassToEnglishUpdate(id);
        }
        return classId;
    }
}

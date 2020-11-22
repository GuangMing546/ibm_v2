package com.wyu.ibm_v2.mapper;

import java.util.ArrayList;
import java.util.Set;

public interface ClassTeacherMapper {
    //根据Teacher的类型和它的ID来找到他所教的班级
    public Set<String> getClassByChineseTeacherId(String teacherId);
    public Set<String> getClassByMathTeacherId(String teacherId);
    public Set<String> getClassByEnglishTeacherId(String teacherId);

    //更新老师的时候，查出可以更新的班级有哪些
    public Set<String> getEmptyClassToChineseUpdate(String teacherId);
    public Set<String> getEmptyClassToMathUpdate(String teacherId);
    public Set<String> getEmptyClassToEnglishUpdate(String teacherId);

    //更新，插入，删除都用的是这些方法
    public int updateChineseTeacher(String classId,String teacherId);
    public int updateMathTeacher(String classId,String teacherId);
    public int updateEnglishTeacher(String classId,String teacherId);
}

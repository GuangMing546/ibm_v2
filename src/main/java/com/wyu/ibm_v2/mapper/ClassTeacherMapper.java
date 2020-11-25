package com.wyu.ibm_v2.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public interface ClassTeacherMapper {
    //根据Teacher的类型和它的ID来找到他所教的班级
    public List<String> getClassByChineseTeacherId(Integer id);
    public List<String> getClassByMathTeacherId(Integer id);
    public List<String> getClassByEnglishTeacherId(Integer id);

    //更新老师的时候，查出可以更新的班级有哪些
    public List<String> getEmptyClassToChineseUpdate(Integer id);
    public List<String> getEmptyClassToMathUpdate(Integer id);
    public List<String> getEmptyClassToEnglishUpdate(Integer id);

    //更新，插入，删除都用的是这些方法
    public int updateChineseTeacher(String classId,Integer id);
    public int updateMathTeacher(String classId,Integer id);
    public int updateEnglishTeacher(String classId,Integer id);
}

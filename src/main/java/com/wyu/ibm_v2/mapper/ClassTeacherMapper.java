package com.wyu.ibm_v2.mapper;

import org.apache.ibatis.annotations.Update;

import java.util.Collection;
import java.util.Set;

public interface ClassTeacherMapper {
    //根据Teacher的类型和它的ID来找到他所教的班级
    public Collection<String> getClassByChineseTeacherId(String teacherId);
    public Collection<String> getClassByMathTeacherId(String teacherId);
    public Collection<String> getClassByEnglishTeacherId(String teacherId);

//    //增加老师的时候，先得到这个类型的老师，能教的班级还有哪些
//    public Set<String> getEmptyClassToChinese();
//    public Set<String> getEmptyClassToMath();
//    public Set<String> getEmptyClassToEnglish();

    //更新老师的时候，查出可以更新的班级有哪些
    public Collection<String> getEmptyClassToChineseUpdate(String teacherId);
    public Collection<String> getEmptyClassToMathUpdate(String teacherId);
    public Collection<String> getEmptyClassToEnglishUpdate(String teacherId);

    //更新，插入，删除都用的是这些方法
    public int updateChineseTeacher(String classId,String teacherId);
    public int updateMathTeacher(String classId,String teacherId);
    public int updateEnglishTeacher(String classId,String teacherId);
}

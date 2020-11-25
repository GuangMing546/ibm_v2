package com.wyu.ibm_v2.service.impl;

import com.wyu.ibm_v2.entity.Teacher;
import com.wyu.ibm_v2.mapper.ClassTeacherMapper;
import com.wyu.ibm_v2.mapper.TeacherMapper;
import com.wyu.ibm_v2.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    TeacherMapper teacherMapper;
    @Resource
    ClassTeacherMapper classTeacherMapper;


    @Override
    public List<Teacher> getTeachers() {
        List<Teacher> teachers=teacherMapper.getAllTeacher();
        for (Teacher teacher : teachers) {
            String teacherJod=teacher.getTeacherJod();
            if (teacherJod.equals("chinese")){
                    teacher.setClassId(classTeacherMapper.getClassByChineseTeacherId(teacher.getId()));

            }
            if (teacherJod.equals("math")){
                    teacher.setClassId(classTeacherMapper.getClassByMathTeacherId(teacher.getId()));
            }
            if (teacherJod.equals("english")){
                    teacher.setClassId(classTeacherMapper.getClassByEnglishTeacherId(teacher.getId()));
            }
        }
        return teachers;
    }

    @Override
    public String update(Teacher teacher) {
        //修改功能:teacherJod能修改，没有teacherId，用主键Id来代替

        List<String> classIds ;
        List<String> classIdsExist ;

        //这个是得到修改前老师的工作职务是啥
        String teacherOldJod = teacherMapper.getTeacherById(teacher.getId()).getTeacherJod();
        String teacherNewJod=teacher.getTeacherJod();
        System.out.println("旧职业"+teacherOldJod);
        System.out.println("新职业"+teacherNewJod);
        //先更新老师
        int flag=teacherMapper.updateTeacherById(teacher); //修改teacher表的信息,注意Id是不能修改的
        if(0==flag){
            return "更新失败";
        }
        //语文
        if(teacherOldJod.equals("chinese")){
            classIds = classTeacherMapper.getEmptyClassToChineseUpdate(teacher.getId()); //旧的classId
            classIdsExist=classTeacherMapper.getClassByChineseTeacherId(teacher.getId()); //新的classId

            System.out.println("classId"+classIds);
            System.out.println("classIdsExist"+classIdsExist);

            //把老师原来所教的班级置为0
            for (String s : classIdsExist ) {
                classTeacherMapper.updateChineseTeacher(s,0);
            }
            //修改class表的数据
            if(teacherNewJod.equals("chinese")) {
                for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                    classTeacherMapper.updateChineseTeacher(classId, teacher.getId());
                }
                return "success";
            }
            if(teacherNewJod.equals("math")) {
                for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                    classTeacherMapper.updateMathTeacher(classId, teacher.getId());
                }
                return "success";
            }
            if(teacherNewJod.equals("english")) {
                for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                    classTeacherMapper.updateEnglishTeacher(classId, teacher.getId());
                }
                return "success";
            }
        }
        //数学
        if(teacherOldJod.equals("math")){
            classIds = classTeacherMapper.getEmptyClassToMathUpdate(teacher.getId()); //旧的classId
            classIdsExist=classTeacherMapper.getClassByMathTeacherId(teacher.getId()); //新的classId
            //把老师原来所教的班级置为0
            for (String s : classIdsExist ) {
                classTeacherMapper.updateMathTeacher(s,0);
            }
            //修改class表的数据
            if(teacherNewJod.equals("chinese")) {
                for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                    classTeacherMapper.updateChineseTeacher(classId, teacher.getId());
                }
                return "success";
            }
            if(teacherNewJod.equals("math")) {
                for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                    classTeacherMapper.updateMathTeacher(classId, teacher.getId());
                }
                return "success";
            }
            if(teacherNewJod.equals("english")) {
                for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                    classTeacherMapper.updateEnglishTeacher(classId, teacher.getId());
                }
                return "success";
            }
        }
        //英语
        if(teacherOldJod.equals("english")){
            classIds = classTeacherMapper.getEmptyClassToEnglishUpdate(teacher.getId()); //旧的classId
            classIdsExist=classTeacherMapper.getClassByEnglishTeacherId(teacher.getId()); //新的classId


            //把老师原来所教的班级置为0
            for (String s : classIdsExist ) {
                classTeacherMapper.updateEnglishTeacher(s,0);
            }
            //修改class表的数据
            if(teacherNewJod.equals("chinese")) {
                for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                    classTeacherMapper.updateChineseTeacher(classId, teacher.getId());
                }
                return "success";
            }
            if(teacherNewJod.equals("math")) {
                for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                    classTeacherMapper.updateMathTeacher(classId, teacher.getId());
                }
                return "success";
            }
            if(teacherNewJod.equals("english")) {
                for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                    classTeacherMapper.updateEnglishTeacher(classId, teacher.getId());
                }
                return "success";
            }
        }
        return "false";
    }

    @Override
    public String insertTeacher(Teacher teacher) {
        String teacherJod=teacher.getTeacherJod();
        List<String> classIds;
        if (teacherJod.equals("chinese")){
//            classIds=classTeacherMapper.getClassByChineseTeacherId(0);
//            if(!classIds.containsAll(teacher.getClassId())){
//                return "班级填写错误";
//            }
            teacher.setId(teacherMapper.getMaxId()+1);
            int flag=teacherMapper.insertTeacher(teacher);
            if (flag==0){
                return "userName已存在";
            }
            System.out.println(teacher.getId());
            for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                classTeacherMapper.updateChineseTeacher(classId,teacher.getId());
            }
            return "success";
        }

        if (teacherJod.equals("math")){
//            classIds=classTeacherMapper.getClassByMathTeacherId(0);
//            if(!classIds.containsAll(teacher.getClassId())){
//                return "班级填写错误";
//            }
            teacher.setId(teacherMapper.getMaxId()+1);
            int flag=teacherMapper.insertTeacher(teacher);
            if (flag==0){
                return "teacherId或userName已存在";
            }
            for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                classTeacherMapper.updateMathTeacher(classId,teacher.getId());
            }
            return "success";
        }

        if (teacherJod.equals("english")){
//            classIds=classTeacherMapper.getClassByEnglishTeacherId(0);
//            if(!classIds.containsAll(teacher.getClassId())){
//                return "班级填写错误";
//            }
            teacher.setId(teacherMapper.getMaxId()+1);
            int flag=teacherMapper.insertTeacher(teacher);
            if (flag==0){
                return "teacherId或userName已存在";
            }
            for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                classTeacherMapper.updateEnglishTeacher(classId,teacher.getId());
            }
            return "success";
        }
        return "false";
    }

    @Override
    public String deleteTeacherById(Teacher teacher) {
        String teacherJod=teacher.getTeacherJod(); //获取其教授的科目
        List<String> classIdsExist;
        System.out.println("teacherID:"+teacher.getId());

        if(teacherJod.equals("chinese")){
            classIdsExist=classTeacherMapper.getClassByChineseTeacherId(teacher.getId());
            System.out.println("他原来教语文的，教的班级是"+classIdsExist);
            // 让他教的班级都置为0
            for (String s : classIdsExist) {
                classTeacherMapper.updateChineseTeacher(s,0);
            }
            // 删除这个教师
            teacherMapper.deleteByTeacherId(teacher.getId());
            return "true";

        }
        if(teacherJod.equals("math")){
            classIdsExist=classTeacherMapper.getClassByMathTeacherId(teacher.getId());
            for (String s : classIdsExist) {
                classTeacherMapper.updateMathTeacher(s,0);
            }
            teacherMapper.deleteByTeacherId(teacher.getId());
            return "true";
        }
        if(teacherJod.equals("english")){
            classIdsExist=classTeacherMapper.getClassByEnglishTeacherId(teacher.getId());
            for (String s : classIdsExist) {
                classTeacherMapper.updateEnglishTeacher(s,0);
            }
            teacherMapper.deleteByTeacherId(teacher.getId());
            return "true";
        }
        return "false";
    }

    @Override
    public Teacher getTeacherById(Integer id) {
        return teacherMapper.getTeacherById(id);
    }

    @Override
    public int updateTeacherPassword(Teacher teacher) {
        return teacherMapper.updateTeacherPassword(teacher);
    }



}

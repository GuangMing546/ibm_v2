package com.wyu.ibm_v2.service.impl;

import com.wyu.ibm_v2.entity.Teacher;
import com.wyu.ibm_v2.mapper.ClassTeacherMapper;
import com.wyu.ibm_v2.mapper.TeacherMapper;
import com.wyu.ibm_v2.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    TeacherMapper teacherMapper;
    @Resource
    ClassTeacherMapper classTeacherMapper;


    @Override
    public List<Teacher> getTeachers(String teacherJod) {
        List<Teacher> teachers=teacherMapper.getAllTeacher(teacherJod);

        if (teacherJod.equals("chinese")){
            for (Teacher teacher : teachers) {
                teacher.setClassId(classTeacherMapper.getClassByChineseTeacherId(teacher.getTeacherId()));
            }
        }
        if (teacherJod.equals("math")){
            for (Teacher teacher : teachers) {
                teacher.setClassId(classTeacherMapper.getClassByMathTeacherId(teacher.getTeacherId()));
            }

        }
        if (teacherJod.equals("english")){
            for (Teacher teacher : teachers) {
                teacher.setClassId(classTeacherMapper.getClassByEnglishTeacherId(teacher.getTeacherId()));
            }

        }
        return teachers;
    }

    @Override
    public String update(Teacher teacher) {
        //修改功能teacher_ID和teacher_jod不能修改
        String teacherJod=teacher.getTeacherJod();
        Set<String> classIds;
        Set<String> classIdsExist;



        if(teacherJod.equals("chinese")){
            classIds = classTeacherMapper.getEmptyClassToChineseUpdate(teacher.getTeacherId());
            classIdsExist=classTeacherMapper.getClassByChineseTeacherId(teacher.getTeacherId());
            if(!classIds.containsAll(teacher.getClassId())){
                return "班级填写错误";
            }
            int flag=teacherMapper.updateTeacherById(teacher); //修改teacher表的信息
            if(0 == flag){
                return "userName已存在";
            }
            //现把它原来的置为0
            for (String s : classIdsExist ) {
                classTeacherMapper.updateChineseTeacher(s,"0");
            }
            for (String classId : classIds) {           //修改class_teacher表的信息
                classTeacherMapper.updateChineseTeacher(classId,teacher.getTeacherId());
            }
            return "success";
        }

        if(teacherJod.equals("math")){
            classIds = classTeacherMapper.getEmptyClassToMathUpdate(teacher.getTeacherId());
            classIdsExist=classTeacherMapper.getClassByMathTeacherId(teacher.getTeacherId());
            if(!classIds.containsAll(teacher.getClassId())){
                return "班级填写错误";
            }
            int flag=teacherMapper.updateTeacherById(teacher); //修改teacher表的信息
            if(0 == flag){
                return "userName已存在";
            }
            //现把它原来的置为0
            for (String s : classIdsExist ) {
                classTeacherMapper.updateChineseTeacher(s,"0");
            }
            for (String classId : classIds) {           //修改class_teacher表的信息
                classTeacherMapper.updateChineseTeacher(classId,teacher.getTeacherId());
            }
            return "success";
        }

        if(teacherJod.equals("english")){
            classIds = classTeacherMapper.getEmptyClassToEnglishUpdate(teacher.getTeacherId());
            classIdsExist=classTeacherMapper.getClassByEnglishTeacherId(teacher.getTeacherId());
            if(!classIds.containsAll(teacher.getClassId())){
                return "班级填写错误";
            }
            int flag=teacherMapper.updateTeacherById(teacher); //修改teacher表的信息
            if(0==flag){
                return "userName已存在";
            }
            //现把它原来的置为0
            for (String s : classIdsExist ) {
                classTeacherMapper.updateChineseTeacher(s,"0");
            }
            for (String classId : classIds) {           //修改class_teacher表的信息
                classTeacherMapper.updateEnglishTeacher(classId,teacher.getTeacherId());
            }
            return "success";
        }
        return "false";
    }

    @Override
    public String insertTeacher(Teacher teacher) {
        String teacherJod=teacher.getTeacherJod();
        Set<String> classIds;
        if (teacherJod.equals("chinese")){
            classIds=classTeacherMapper.getClassByChineseTeacherId("0");
            if(!classIds.containsAll(teacher.getClassId())){
                return "班级填写错误";
            }
            int flag=teacherMapper.insertTeacher(teacher);
            if (flag==0){
                return "teacherId或userName已存在";
            }
            for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                classTeacherMapper.updateChineseTeacher(classId,teacher.getTeacherId());
            }
            return "success";
        }

        if (teacherJod.equals("math")){
            classIds=classTeacherMapper.getClassByMathTeacherId("0");
            if(!classIds.containsAll(teacher.getClassId())){
                return "班级填写错误";
            }
            int flag=teacherMapper.insertTeacher(teacher);
            if (flag==0){
                return "teacherId或userName已存在";
            }
            for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                classTeacherMapper.updateMathTeacher(classId,teacher.getTeacherId());
            }
            return "success";
        }

        if (teacherJod.equals("english")){
            classIds=classTeacherMapper.getClassByEnglishTeacherId("0");
            if(!classIds.containsAll(teacher.getClassId())){
                return "班级填写错误";
            }
            int flag=teacherMapper.insertTeacher(teacher);
            if (flag==0){
                return "teacherId或userName已存在";
            }
            for (String classId : teacher.getClassId()) {           //修改class_teacher表的信息
                classTeacherMapper.updateEnglishTeacher(classId,teacher.getTeacherId());
            }
            return "success";
        }

        return "false";
    }

    @Override
    public String deleteTeacherById(Teacher teacher) {
        teacherMapper.deleteByTeacherId(teacher);
        String teacherJod=teacher.getTeacherJod();
        Set<String> classIdsExist;
        if(teacherJod.equals("chinese")){
            classIdsExist=classTeacherMapper.getClassByChineseTeacherId(teacher.getTeacherId());
            for (String s : classIdsExist) {
                classTeacherMapper.updateChineseTeacher(s,"0");
            }
            return "true";
        }
        if(teacherJod.equals("math")){
            classIdsExist=classTeacherMapper.getClassByMathTeacherId(teacher.getTeacherId());
            for (String s : classIdsExist) {
                classTeacherMapper.updateMathTeacher(s,"0");
            }
            return "true";
        }
        if(teacherJod.equals("english")){
            classIdsExist=classTeacherMapper.getClassByEnglishTeacherId(teacher.getTeacherId());
            for (String s : classIdsExist) {
                classTeacherMapper.updateEnglishTeacher(s,"0");
            }
            return "true";
        }

        return "false";
    }
}

package com.wyu.ibm_v2.controller;


import com.wyu.ibm_v2.entity.Teacher;
import com.wyu.ibm_v2.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class TeacherController {
    @Autowired
    TeacherServiceImpl teacherService;

    /*Admin用户对teacher表的操作*/
    //Admin界面展示所有的老师信息
    @GetMapping("/getTeachersToAdmin/{teacherJod}")
    public List<Teacher> getTeachersToAdmin(@PathVariable String teacherJod){
        System.out.println(teacherJod);
        return teacherService.getTeachers(teacherJod);
    }
    //Admin界面插入老师功能
    @PostMapping("/insertTeacher")
    public String insertTeacher(@RequestBody Teacher teacher){
        System.out.println(teacher);
        return teacherService.insertTeacher(teacher);
    }
    //Admin界面更新老师功能
    @PostMapping("/updateTeacher")
    public String updateTeacher(@RequestBody Teacher teacher){
        System.out.println(teacher);
        return teacherService.update(teacher);
    }
    //Admin界面删除老师功能
    @PostMapping("/deleteTeacher")
    public String deleteTeacher(@RequestBody Teacher teacher){
        return teacherService.deleteTeacherById(teacher);
    }

    /*Teacher用户对teacher表的操作*/
    //teacher界面修改老师的密码
    @PostMapping("/updateTeacherPassword")
    public int updateTeacherPassword(@RequestBody Teacher teacher){
        return teacherService.updateTeacherPassword(teacher);
    }

}

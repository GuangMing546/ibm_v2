package com.wyu.ibm_v2.controller;


import com.wyu.ibm_v2.entity.Student;
import com.wyu.ibm_v2.entity.Teacher;
import com.wyu.ibm_v2.service.impl.TeacherServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping("/test")
//@Api(value = "/TeacherController",tags = "接口开放示例")
public class TeacherController {

   // @ApiOperation(value = "接口功能介绍",notes = "提示接口使用者注意事项",httpMethod = "GET")
    @Autowired
//    @Resource
    TeacherServiceImpl teacherService;

    /*Admin用户对teacher表的操作*/
    //Admin界面展示所有的老师信息
    @GetMapping("/getTeachersToAdmin")
    public List<Teacher> getTeachersToAdmin(){
        System.out.println();
        return teacherService.getTeachers();
    }
    //Admin界面插入老师功能
    @PostMapping("/insertTeacher")
    public String insertTeacher(@RequestBody Teacher teacher){
//        System.out.println("==="+teacher.getUserName());
//        System.out.println("==="+teacher.getTeacherName());
//        System.out.println("==="+teacher.getPassword());
//        System.out.println("==="+teacher.getTeacherJod());
//        System.out.println("==="+teacher.getClassId());
        return teacherService.insertTeacher(teacher);
    }
    //Admin界面更新老师功能
    @PostMapping("/updateTeacher")
    public String updateTeacher(@RequestBody Teacher teacher){
//        System.out.println(teacher);
        return teacherService.update(teacher);
    }
    //Admin界面删除老师功能
    @PostMapping("/deleteTeacher")
    public String deleteTeacher(@RequestBody Teacher teacher){
        System.out.println("管理员删除老师了");
        System.out.println("老师的id是"+teacher.getId());
        System.out.println("老师的教授的科目是"+teacher.getTeacherJod());
        return teacherService.deleteTeacherById(teacher);
    }

    /*Teacher用户对teacher表的操作*/
    //teacher界面修改老师的密码
    @PostMapping("/updateTeacherPassword")
    public int updateTeacherPassword(@RequestBody Teacher teacher){
        return teacherService.updateTeacherPassword(teacher);
    }

    @GetMapping("/getTeacherById")
    public Teacher getTeacherById(Integer id){
        return teacherService.getTeacherById(id);
    }

}

package com.wyu.ibm_v2.controller;


import com.wyu.ibm_v2.entity.Student;
import com.wyu.ibm_v2.service.impl.StudentServiceImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/test")
//@Api(value = "/StudentController",tags = "接口开放示例")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;

    /*Admin用户对学生表的操作的操作*/

    //Admin页面按展示所有学生的信息
    @GetMapping("/getStudentsToAdmin")
    public List<Student> getStudentsToAdmin(){
        return studentService.getAllStudentToAdmin();
    }
    //Admin界面插入学生功能
    @PostMapping("/insertStudent")
    public int insertStudent(@RequestBody Student student){
        System.out.println(student.toString());
        return studentService.insertStudentFromAdmin(student);
    }
    //Admin界面修改学生功能
    @PostMapping("/updateStudent")
    public int updateStudent(@RequestBody Student student){
        System.out.println(student.toString());
        return studentService.updateStudentFromAdmin(student);
    }
    //Admin界面删除学生功能
    @PostMapping("/deleteStudent")
    public int deleteStudent(@RequestBody Integer id){
        return studentService.deleteStudentFromAdmin(id);
    }



    /*Teacher用户对学生表的操作*/
    //teacher界面展示所有的学生信息
    @GetMapping("/getStudentsToTeacher/{classId}")
    public List<Student> getStudentsToTeacher(@PathVariable String classId){
        System.out.println(classId);
        List<Student> a =studentService.getAllStudentToTeacher(classId);
        for(Student s:a){
            System.out.println(s.toString());
        }

        return studentService.getAllStudentToTeacher(classId);
    }
    //teacher界面修改学生的成绩
    @PostMapping("/updateScoreFromTeacher")
    public int updateStudentScore(@RequestBody Student student){
        System.out.println(student.toString());
        return studentService.updateStudentScore(student);
    }

    /*Student用户对学生表的操作*/
    //student界面修改学生的密码
    @PostMapping("/updateStudentPassword")
    public int updateStudentPassword(@RequestBody Student student){
        return studentService.updateStudentPassword(student);
    }

    @GetMapping("/getStudentById")
    public Student getStudentById(Integer id){
        return studentService.getStudentById(id);
    }


}

package com.wyu.ibm_v2.controller;

import com.wyu.ibm_v2.entity.Teacher;
import com.wyu.ibm_v2.service.impl.QueryClassIdImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class ShowClassIdController {
    @Autowired
    QueryClassIdImpl queryClassId;
    @GetMapping("/queryClassIdForInsert/{teacherJod}")
    public Set<String> queryClassIdForInsert(@PathVariable String teacherJod){
        System.out.println(teacherJod);
        Set<String> a=queryClassId.queryClassIdForInsert(teacherJod);
        return a;
    }
    @GetMapping("/queryClassIdForUpdate")
    public Set<String> queryClassIdForUpdate(@RequestBody Teacher teacher){
        return queryClassId.queryClassIdForUpdate(teacher.getTeacherId(),teacher.getTeacherJod());
    }


}

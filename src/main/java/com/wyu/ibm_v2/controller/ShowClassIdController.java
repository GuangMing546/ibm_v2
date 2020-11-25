package com.wyu.ibm_v2.controller;

import com.wyu.ibm_v2.entity.Teacher;
import com.wyu.ibm_v2.service.impl.QueryClassIdServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/test")
public class ShowClassIdController {
    @Autowired
    QueryClassIdServiceImpl queryClassId;
    @GetMapping("queryClassIdForInsert/{teacherJod}")
    public List<String> queryClassIdForInsert(@PathVariable String teacherJod){
        System.out.println(teacherJod);
        return queryClassId.queryClassIdForInsert(teacherJod);
    }
    @GetMapping("queryClassIdForInsert")
    public List<String> queryClassIdForUpdate(@RequestBody Teacher teacher){
        return queryClassId.queryClassIdForUpdate(teacher.getId(),teacher.getTeacherJod());
    }


}

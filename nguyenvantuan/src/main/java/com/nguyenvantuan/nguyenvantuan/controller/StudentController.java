package com.nguyenvantuan.nguyenvantuan.controller;

import com.nguyenvantuan.nguyenvantuan.entity.StudentEntity;
import com.nguyenvantuan.nguyenvantuan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping({"/index"})
    public String index(Model model){
        List<StudentEntity> sutdent =studentService.getAllStudent();
        model.addAttribute("student", sutdent);
        return "index";
    }

    @PostMapping({"/"})
    public String login(Model model, @RequestParam Map<String, String> params){
        return "index";
    }

//    @GetMapping({"/creat"})
//    public String creat(Model model, @RequestBody StudentEntity s){
//        StudentEntity students = studentService.creatStudent(s);
//        model.addAttribute("students", students);
//        return "create";
//    }



}

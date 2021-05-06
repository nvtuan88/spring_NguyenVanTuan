package com.nguyenvantuan.nguyenvantuan.service;

import com.nguyenvantuan.nguyenvantuan.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> getAllStudent();
    StudentEntity creatStudent(StudentEntity student);
    StudentEntity updateStudent(int id);
    StudentEntity deleteStudent(int id);
}

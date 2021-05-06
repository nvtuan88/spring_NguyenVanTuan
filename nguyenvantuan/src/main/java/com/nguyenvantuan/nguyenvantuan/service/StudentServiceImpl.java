package com.nguyenvantuan.nguyenvantuan.service;

import com.nguyenvantuan.nguyenvantuan.entity.StudentEntity;
import com.nguyenvantuan.nguyenvantuan.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<StudentEntity> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public StudentEntity creatStudent(StudentEntity student) {
        return studentRepo.save(student);
    }

    @Override
    public StudentEntity updateStudent(int id) {
        return null;
    }

    @Override
    public StudentEntity deleteStudent(int id) {
        return null;
    }
}

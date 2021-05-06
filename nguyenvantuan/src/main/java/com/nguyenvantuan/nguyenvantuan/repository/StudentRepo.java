package com.nguyenvantuan.nguyenvantuan.repository;

import com.nguyenvantuan.nguyenvantuan.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {
}

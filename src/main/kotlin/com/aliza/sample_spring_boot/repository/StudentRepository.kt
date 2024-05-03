package com.aliza.sample_spring_boot.repository

import com.aliza.sample_spring_boot.model.Student
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : CrudRepository<Student, Int>
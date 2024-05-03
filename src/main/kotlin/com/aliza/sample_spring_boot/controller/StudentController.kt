package com.aliza.sample_spring_boot.controller

import com.aliza.sample_spring_boot.model.student.Student
import com.aliza.sample_spring_boot.model.student.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class StudentController {

    lateinit var _studentRepository: StudentRepository
    @Autowired
    fun set_student_repository(studentRepository: StudentRepository) {
        _studentRepository = studentRepository
    }

    @GetMapping("/student")
    fun getAllStudents(): ResponseEntity<MutableIterable<Student>> {
        val dataFromDatabase = _studentRepository.findAll()
        return ResponseEntity.ok(dataFromDatabase)
    }

}

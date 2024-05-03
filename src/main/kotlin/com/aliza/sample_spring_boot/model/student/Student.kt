package com.aliza.sample_spring_boot.model.student

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Student(

    @Id
    val name: String,

    val course: String,
    var score: Int

) {
    constructor() : this("", "", -1)
}
package com.aliza.sample_spring_boot.model

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Student(

    @Id
    var id: Long,

    var name: String,
    val course: String,
    var score: Int

) {
    constructor() : this(0, "", "", -1)
}
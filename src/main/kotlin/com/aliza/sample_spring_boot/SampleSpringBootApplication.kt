package com.aliza.sample_spring_boot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class SampleSpringBootApplication

fun main(args: Array<String>) {
	runApplication<SampleSpringBootApplication>(*args)
}

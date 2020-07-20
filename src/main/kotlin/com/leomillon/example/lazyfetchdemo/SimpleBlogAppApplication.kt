package com.leomillon.example.lazyfetchdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleBlogAppApplication

fun main(args: Array<String>) {
	runApplication<SimpleBlogAppApplication>(*args)
}

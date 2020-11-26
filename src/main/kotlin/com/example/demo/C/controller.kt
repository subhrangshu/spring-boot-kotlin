package com.example.demo.C

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("C/")
class ControllerC {
    @Autowired
    lateinit var c: C;

    @GetMapping("c/")
    fun helloWorld() = c.c()
}
package com.example.demo.A

import com.example.demo.nested.TestClass
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("A/")
class ControllerA {
    @Autowired
    lateinit var a: A;

    @GetMapping("a/")
    fun helloWorld() = a.a()
}
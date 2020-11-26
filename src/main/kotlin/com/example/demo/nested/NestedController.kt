package com.example.demo.nested

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("nested/")
class NestedController {

    @Autowired
    lateinit var testClass: TestClass;

    @GetMapping("world1/")
    fun helloWorld() = "Hello World 1!"

    @GetMapping("world2/")
    fun helloWorld2() = "Hello World 2"

    @GetMapping("test/")
    fun test() = testClass.testFunction()
}
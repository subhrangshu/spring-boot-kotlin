package com.example.demo


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("hello/")
class OtherTestController {
    @GetMapping("world1/")
    fun helloWorld() = "Hello World 1!"

    @GetMapping("world2/")
    fun helloWorld2() = "Hello World 2"
}
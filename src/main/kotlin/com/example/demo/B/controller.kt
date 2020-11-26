package com.example.demo.B

import com.example.demo.B.B
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("B/")
class ControllerB {
    @Autowired
    lateinit var b: B;

    @GetMapping("b/")
    fun helloWorld() = b.b()
}
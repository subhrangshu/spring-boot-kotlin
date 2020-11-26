package com.example.demo.nested.nested2

import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Service
@RestController
class TestClass2 {
    fun testFunction2(): String {
        return "Test String"
    }
}
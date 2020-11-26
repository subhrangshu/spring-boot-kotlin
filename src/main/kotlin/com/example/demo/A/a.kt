package com.example.demo.A

import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RestController

@Service
@RestController
class A {
    fun a(): String {
        return "Hello From A"
    }
}
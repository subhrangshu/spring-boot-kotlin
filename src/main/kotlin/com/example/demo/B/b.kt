package com.example.demo.B

import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RestController

@Service
@RestController
class B {
    fun b(): String {
        return "Hello From B"
    }
}
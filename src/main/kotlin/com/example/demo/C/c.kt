package com.example.demo.C

import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RestController

@Service
@RestController
class C {
    fun c(): String {
        return "Hello From C"
    }
}
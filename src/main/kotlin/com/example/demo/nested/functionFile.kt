package com.example.demo.nested

import com.example.demo.nested.nested2.TestClass2
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Service
@RestController
class TestClass {
    @Autowired
    lateinit var testClass2: TestClass2

    fun testFunction(): String {
        return "Test String"
    }
    @GetMapping("test2/")
    fun testClass2() = testClass2.testFunction2()
}
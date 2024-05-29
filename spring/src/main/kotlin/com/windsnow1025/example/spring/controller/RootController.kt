package com.windsnow1025.example.spring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class RootController {
   @GetMapping("/")
    fun index(): String {
         return "Hello, World!"
    }
}
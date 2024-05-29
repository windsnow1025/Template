package com.windsnow1025.example.spring.entity

import jakarta.persistence.*

@Entity
class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Int? = null,

    @Column(unique = true)
    var username: String?,

    var password: String,
)
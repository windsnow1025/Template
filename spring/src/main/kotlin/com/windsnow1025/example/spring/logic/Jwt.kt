package com.windsnow1025.example.spring.logic

import io.jsonwebtoken.Jwts
import io.jsonwebtoken.security.Keys

private const val secret = "learn.windsnow1025.com/example/spring"
private val key = Keys.hmacShaKeyFor(secret.toByteArray())

fun createTokenFromUsername(username: String): String {
    return Jwts.builder()
        .subject(username)
        .signWith(key)
        .compact()
}

fun parseUsernameFromToken(token: String): String {
    return Jwts.parser()
        .verifyWith(key)
        .build()
        .parseSignedClaims(token)
        .payload
        .subject
}

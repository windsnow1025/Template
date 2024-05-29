package com.windsnow1025.example.spring.service

import com.windsnow1025.example.spring.logic.createTokenFromUsername
import com.windsnow1025.example.spring.logic.parseUsernameFromToken
import com.windsnow1025.example.spring.entity.User
import com.windsnow1025.example.spring.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    val userRepository: UserRepository, ) {
    fun getUserByToken(token: String): User? {
        val username = parseUsernameFromToken(token)
        return userRepository.findByUsername(username)
    }

    fun signIn(user: User): String? {
        val existingUser = userRepository.findByUsername(user.username!!)
        if (existingUser != null && existingUser.password == user.password) {
            return createTokenFromUsername(existingUser.username!!)
        }
        return null
    }

    fun signUp(user: User): User {
        return userRepository.save(user)
    }
}
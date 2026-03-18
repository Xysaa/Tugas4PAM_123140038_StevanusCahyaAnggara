package com.example.tugas4pam

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
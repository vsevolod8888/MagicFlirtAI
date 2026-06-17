package com.magicflirtai.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
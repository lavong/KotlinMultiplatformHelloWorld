package com.ingloriousmind.kotlinmultiplatformhelloworld.common

expect fun platformName(): String

fun createHelloWorldMessage() : String {
    return "Hello, ${platformName()} World!"
}

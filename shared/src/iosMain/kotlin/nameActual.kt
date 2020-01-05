package com.ingloriousmind.kotlinmultiplatformhelloworld.common

import platform.UIKit.UIDevice

actual fun platformName(): String {
    return with(UIDevice.currentDevice) {
        "${systemName()} ($systemVersion)"
    }
}

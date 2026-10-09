package com.kodraliu.localrock.shared.protocol

import java.io.File
import java.security.SecureRandom

internal actual fun secureRandomBytes(size: Int): ByteArray {
    val buf = ByteArray(size)
    SecureRandom().nextBytes(buf)
    return buf
}

actual fun saveDebugBlob(name: String, bytes: ByteArray): String? {
    val dir = File(System.getProperty("user.home"), ".localrock/debug")
    if (!dir.isDirectory && !dir.mkdirs()) return null
    val file = File(dir, name)
    file.writeBytes(bytes)
    return file.absolutePath
}

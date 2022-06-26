package com.example.minio.spring.domain.model


class FileInfo(
    val bucket: String,
    val path: String,
    val isDir: Boolean,
    val payload: String? = null,
) {
}

enum class FileExtension(
    val ext: String
) {
    JSON("json")
}
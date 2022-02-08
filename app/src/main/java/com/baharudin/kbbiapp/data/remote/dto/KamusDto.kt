package com.baharudin.kbbiapp.data.remote.dto

import com.baharudin.kbbiapp.domain.model.Kamus

data class KamusDto(
    val data: List<DataDto>,
    val message: String,
    val status: Boolean
) {
    fun toKamus() : Kamus {
        return Kamus(
            data = data.map { it.toData() },
            message = message,
            status = status
        )
    }
}
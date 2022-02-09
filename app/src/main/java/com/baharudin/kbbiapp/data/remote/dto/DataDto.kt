package com.baharudin.kbbiapp.data.remote.dto

import com.baharudin.kbbiapp.domain.model.Data

data class DataDto(
    val arti: List<ArtiDto>,
    val lema: String
) {
    fun toData() : Data {
        return Data(
            arti = arti.map {
                            it.
            },
            lema = lema
        )
    }
}
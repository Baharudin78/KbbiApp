package com.baharudin.kbbiapp.data.remote.dto

import com.baharudin.kbbiapp.domain.model.Data
import com.google.gson.annotations.SerializedName

data class DataDto(
    @SerializedName("arti")
    val arti: List<ArtiDto>,
    @SerializedName("lema")
    val lema: String
) {
    fun toData() : Data {
        return Data(
            arti = arti,
            lema = lema
        )
    }
}
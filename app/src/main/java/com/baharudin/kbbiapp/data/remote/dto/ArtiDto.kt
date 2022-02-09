package com.baharudin.kbbiapp.data.remote.dto

import com.baharudin.kbbiapp.domain.model.Arti
import com.google.gson.annotations.SerializedName

data class ArtiDto(
    val deskripsi: String,
    @SerializedName("kelas_kata")
    val kelasKata: String
) {
    fun ArtiDto.toArti() : Arti {
        return Arti(
            deskripsi = deskripsi,
            kelasKata = kelasKata
        )
    }
}

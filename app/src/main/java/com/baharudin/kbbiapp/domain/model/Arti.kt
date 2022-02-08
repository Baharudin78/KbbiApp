package com.baharudin.kbbiapp.domain.model

import com.google.gson.annotations.SerializedName

data class Arti(
    val deskripsi: String,
    @SerializedName("kelas_kata")
    val kelasKata: String
)
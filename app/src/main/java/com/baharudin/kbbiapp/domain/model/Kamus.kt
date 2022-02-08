package com.baharudin.kbbiapp.domain.model

import com.baharudin.kbbiapp.data.remote.dto.DataDto

data class Kamus(
    val data: List<Data>,
    val message: String,
    val status: Boolean
)
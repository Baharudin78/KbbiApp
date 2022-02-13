package com.baharudin.kbbiapp.domain.model

import com.baharudin.kbbiapp.data.remote.dto.ArtiDto

data class Data (
    val arti : List<ArtiDto>,
    val lema : String
        )
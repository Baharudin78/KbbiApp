package com.baharudin.kbbiapp.presentation.component

import com.baharudin.kbbiapp.domain.model.Data

data class KamusState(
    val isLoading : Boolean = false,
    val kamus : Data ?= null,
    val error : String = ""
)

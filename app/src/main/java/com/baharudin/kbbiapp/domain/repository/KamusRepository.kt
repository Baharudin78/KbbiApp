package com.baharudin.kbbiapp.domain.repository

import com.baharudin.kbbiapp.data.remote.dto.ArtiDto
import com.baharudin.kbbiapp.data.remote.dto.KamusDto
import com.baharudin.kbbiapp.domain.model.Arti

interface KamusRepository {
    suspend fun cariKata(kosaKata : String) : KamusDto
}
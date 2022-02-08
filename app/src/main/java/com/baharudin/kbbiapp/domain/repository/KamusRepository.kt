package com.baharudin.kbbiapp.domain.repository

import com.baharudin.kbbiapp.data.remote.dto.KamusDto

interface KamusRepository {
    suspend fun cariKata(kosaKata : String) : KamusDto
}
package com.baharudin.kbbiapp.data.repository

import com.baharudin.kbbiapp.data.remote.KamusApi
import com.baharudin.kbbiapp.data.remote.dto.ArtiDto
import com.baharudin.kbbiapp.data.remote.dto.KamusDto
import com.baharudin.kbbiapp.domain.repository.KamusRepository
import javax.inject.Inject

class KamusRepositoryImpl @Inject constructor(
    private val kamusApi : KamusApi
) : KamusRepository{
    override suspend fun cariKata(kosaKata: String): KamusDto {
        return kamusApi.cariKata(kosaKata)
    }
}
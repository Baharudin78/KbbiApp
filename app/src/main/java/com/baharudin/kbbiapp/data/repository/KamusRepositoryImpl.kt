package com.baharudin.kbbiapp.data.repository

import com.baharudin.kbbiapp.common.Resource
import com.baharudin.kbbiapp.common.WrapperListResponse
import com.baharudin.kbbiapp.data.remote.KamusApi
import com.baharudin.kbbiapp.data.remote.dto.DataDto
import com.baharudin.kbbiapp.domain.model.Arti
import com.baharudin.kbbiapp.domain.model.Data
import com.baharudin.kbbiapp.domain.repository.KamusRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject

class KamusRepositoryImpl @Inject constructor(
    private val kamusApi : KamusApi
) : KamusRepository{
    override suspend fun cariKata(kosaKata: String): DataDto {
        return kamusApi.cariKata(kosaKata)
    }


}
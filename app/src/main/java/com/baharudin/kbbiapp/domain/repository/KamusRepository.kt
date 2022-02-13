package com.baharudin.kbbiapp.domain.repository

import com.baharudin.kbbiapp.common.Resource
import com.baharudin.kbbiapp.common.WrapperListResponse
import com.baharudin.kbbiapp.data.remote.dto.DataDto
import com.baharudin.kbbiapp.domain.model.Data
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface KamusRepository {
    suspend fun cariKata(kosaKata : String) : DataDto
}
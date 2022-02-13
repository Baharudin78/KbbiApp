package com.baharudin.kbbiapp.data.remote

import com.baharudin.kbbiapp.common.WrapperListResponse
import com.baharudin.kbbiapp.data.remote.dto.DataDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface KamusApi {
    @GET("cari/{kosaKata}")
    suspend fun cariKata(
        @Path("kosaKata")
        kosaKata : String
    ) : DataDto
}
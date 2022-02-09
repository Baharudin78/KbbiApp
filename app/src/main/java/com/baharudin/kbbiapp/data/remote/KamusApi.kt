package com.baharudin.kbbiapp.data.remote

import com.baharudin.kbbiapp.data.remote.dto.ArtiDto
import com.baharudin.kbbiapp.data.remote.dto.KamusDto
import retrofit2.http.GET
import retrofit2.http.Path

interface KamusApi {
    @GET("cari/{kosaKata}")
    suspend fun cariKata(
        @Path("kosaKata")
        kosaKata : String
    ) : KamusDto
}
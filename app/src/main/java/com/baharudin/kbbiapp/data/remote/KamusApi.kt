package com.baharudin.kbbiapp.data.remote

import com.baharudin.kbbiapp.data.remote.dto.KamusDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface KamusApi {
    @GET("cari/{kosaKata}")
    suspend fun cariKata(
        @Path("kosaKata")
        kosaKata : String
    ) : KamusDto
}
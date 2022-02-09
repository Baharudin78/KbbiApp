package com.baharudin.kbbiapp.di

import com.baharudin.kbbiapp.common.Constant.BASE_URL
import com.baharudin.kbbiapp.data.remote.KamusApi
import com.baharudin.kbbiapp.data.repository.KamusRepositoryImpl
import com.baharudin.kbbiapp.domain.repository.KamusRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit() : KamusApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(KamusApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(kamusApi: KamusApi) : KamusRepository {
        return KamusRepositoryImpl(kamusApi)
    }
}
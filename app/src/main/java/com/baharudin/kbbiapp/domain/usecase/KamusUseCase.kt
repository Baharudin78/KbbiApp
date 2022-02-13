package com.baharudin.kbbiapp.domain.usecase

import com.baharudin.kbbiapp.common.Resource
import com.baharudin.kbbiapp.domain.model.Data
import com.baharudin.kbbiapp.domain.repository.KamusRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class KamusUseCase @Inject constructor(
    private val kamusRepository: KamusRepository
) {
    operator fun invoke(kosaKata : String) : Flow<Resource<Data>> = flow {
        try {
            emit(Resource.Loading<Data>())
            val data = kamusRepository.cariKata(kosaKata).toData()
            emit(Resource.Success<Data>(data))
        }catch (e : HttpException) {
            emit(Resource.Error<Data>(e.localizedMessage ?: "Unexpected Error Occured"))
        }catch (e : IOException) {
            emit(Resource.Error<Data>("Couldn't reach internet connection"))
        }
    }
}
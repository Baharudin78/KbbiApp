package com.baharudin.kbbiapp.domain.usecase

import androidx.lifecycle.SavedStateHandle
import com.baharudin.kbbiapp.common.Resource
import com.baharudin.kbbiapp.data.remote.dto.ArtiDto
import com.baharudin.kbbiapp.data.remote.dto.KamusDto
import com.baharudin.kbbiapp.domain.model.Arti
import com.baharudin.kbbiapp.domain.repository.KamusRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class KamusUseCase @Inject constructor(
    private val kamusRepository: KamusRepository
) {
//    operator fun invoke(kosaKata : String) : Flow<Resource<KamusDto>> = flow {
//        try {
//            emit(Resource.Loading<KamusDto>())
//            val kamus = kamusRepository.cariKata(kosaKata).toKamus()
//            emit(Resource.Success<KamusDto>())
//        }catch (e : HttpException) {
//
//        }catch (e : IOException) {
//
//        }
//    }
}
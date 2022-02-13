package com.baharudin.kbbiapp.presentation.component

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.baharudin.kbbiapp.common.Constant.PARAM_KOSA
import com.baharudin.kbbiapp.common.Resource
import com.baharudin.kbbiapp.domain.usecase.KamusUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class KamusViewModel @Inject constructor(
    private val kamusUseCase: KamusUseCase,
    private val savedStateHandle: SavedStateHandle
) : ViewModel(){
    private val _state = mutableStateOf(KamusState())
    val state : State<KamusState> = _state

    init {
        savedStateHandle.get<String>(PARAM_KOSA)?.let {kosaKata ->
            getKata(kosaKata)
        }
    }

    private fun getKata(kosaKata : String) {
        kamusUseCase(kosaKata).onEach { result ->
            when(result) {
                is Resource.Success -> {
                    _state.value = KamusState(
                        kamus = result.data
                    )
                }
                is Resource.Error -> {
                    _state.value = KamusState(
                        error = result.messege ?: "Unexpected error"
                    )
                }
                is Resource.Loading -> {
                    _state.value = KamusState(
                        isLoading = true
                    )
                }
            }
        }.launchIn(viewModelScope)
    }
}
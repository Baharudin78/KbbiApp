package com.baharudin.kbbiapp.common

sealed class Resource<T>(
    private val data : T? =  null,
    private val messege : String? = null
) {
    class Success<T>(data: T?) : Resource<T>(data)
    class Error<T>(messege: String?, data: T? = null) : Resource<T>(data, messege)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}

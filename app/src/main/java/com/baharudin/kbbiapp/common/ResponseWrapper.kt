package com.baharudin.kbbiapp.common

import com.google.gson.annotations.SerializedName

data class WrapperListResponse<T>(
    var codeResult : Int,
    @SerializedName("message") var message : String,
    @SerializedName("status") var status : Boolean,
    @SerializedName("data") var data : List<T>? = null
)

data class WrapperResponse<T>(
    var codeResult : Int ,
    @SerializedName("message") var message : String,
    @SerializedName("status") var status : Boolean,
    @SerializedName("data") var data : T? = null
)
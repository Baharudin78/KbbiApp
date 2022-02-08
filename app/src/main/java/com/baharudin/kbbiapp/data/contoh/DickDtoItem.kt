package com.baharudin.kbbiapp.data.contoh

data class DickDtoItem(
    val meanings: List<Meaning>,
    val origin: String,
    val phonetic: String,
    val phonetics: List<Phonetic>,
    val word: String
)
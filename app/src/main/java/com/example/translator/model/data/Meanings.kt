package com.example.translator.model.data

import com.google.gson.annotations.SerializedName

class Meanings {
    @field:SerializedName("translation") val translation: Translation? = null
    @field:SerializedName("imageUrl") val imageUrl: String? =null
}
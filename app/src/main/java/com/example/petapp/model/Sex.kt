package com.example.petapp.model

enum class Sex {
    MALE {
        override fun toString() = "Male"
    },
    FEMALE {
        override fun toString() = "Female"
    }
}
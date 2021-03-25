package com.example.petapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Cat(
    val name: String,
    var age: Int,
    val sex: Sex,
    val kind: String,
    var owner: Owner? = null,
    val vaccinations: MutableList<Vaccination> = mutableListOf()
) : Parcelable {
    override fun toString() =
        """$sex cat $name, $age years old, $kind kind,
            |Owner: ${owner ?: "no owner"}" +
            |List of vaccinations:
            |${
                vaccinations.fold("") { result, value -> result + value + "\n" }
                .ifEmpty { "No vaccinations" }
            }
            |""".trimMargin()
}
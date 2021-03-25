package com.example.petapp.extension

import java.util.*

fun GregorianCalendar.getFancyString() =
    "${this.get(GregorianCalendar.YEAR)}.${this.get(GregorianCalendar.MONTH)}.${this.get(
        GregorianCalendar.DAY_OF_MONTH)}"

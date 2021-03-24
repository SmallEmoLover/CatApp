package com.example.petapp

import com.example.petapp.model.*
import java.util.Date

class Repository() {
    fun createPetList(): List<Cat> {
        val flueVaccine =
                Vaccination("Flue", Date(2012, 5, 5), "Saint George`s clinic")
        val rabiesVaccine =
                Vaccination("Rabies", Date(2020, 12, 1), "Municipal clinic of Texas")
        val plagueVaccine =
                Vaccination("Plague", Date(2000, 4, 11), "International cat clinic")

        val matthew = Owner(
                "Matthew", "Gray", "Washington",
                Date(2000, 4, 17), "Third avenue, Seattle"
        )
        val april = Owner(
                "April", "Gray", "Elizabeth",
                Date(1998, 10, 21), "Third avenue, Seattle"
        )
        val sarah = Owner(
                "Sarah", "Adrian", "George",
                Date(1966, 0, 1), "Third avenue"
        )
        val elizabeth = Owner(
                "Elizabeth", "Smith", "Mike",
                Date(2008, 8, 25), "Third avenue"
        )

        val fluffy = Cat("Fluffy", 15, Sex.FEMALE, "Gray", matthew, mutableListOf(flueVaccine))
        val kitty = Cat("Kitty", 12, Sex.FEMALE, "Abyssinian", matthew, mutableListOf(rabiesVaccine))
        val oliver = Cat("Oliver", 10, Sex.MALE, "Asian", april, mutableListOf(flueVaccine, rabiesVaccine))
        val luna = Cat("Luna", 5, Sex.FEMALE, "Bengal", sarah, mutableListOf(flueVaccine, plagueVaccine))
        val milo = Cat("Milo", 5, Sex.MALE, "Bengal", elizabeth, mutableListOf(plagueVaccine, rabiesVaccine))
        val leo = Cat("Leo", 16, Sex.MALE, "Donskoy", matthew, mutableListOf(flueVaccine, rabiesVaccine, plagueVaccine))
        val smokey = Cat("Smokey", 2, Sex.MALE, "Kanaani-katze", vaccinations = mutableListOf(flueVaccine, rabiesVaccine))
        val lilly = Cat("Lilly", 0, Sex.FEMALE, "Manx")
        val daisy = Cat("Daisy", 3, Sex.FEMALE, "Manchkin", matthew)

        return listOf(fluffy, kitty, oliver, luna, milo, leo, smokey, lilly, daisy)
    }

}
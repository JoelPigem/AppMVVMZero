package com.enaitzdam.appmvvmzero

class AlumneProvider {
    companion object {
        fun alumnes(): List<AlumneModel> {
            return alumnes
        }

        private val alumnes = listOf(
            AlumneModel(
                nom = "Joel",
                edat = 19
            ),
            AlumneModel(
                nom = "Joan",
                edat = 40
            ),
            AlumneModel(
                nom = "Nadir",
                edat = 19
            ),
            AlumneModel(
                nom = "Raul",
                edat = 19
            ),
            AlumneModel(
                nom = "Alex",
                edat = 21
            ),
            AlumneModel(
                nom = "Roger",
                edat = 21
            ),
            AlumneModel(
                nom = "Albert",
                edat = 34
            ),
            AlumneModel(
                nom = "Pau",
                edat = 20
            ),
            AlumneModel(
                nom = "Marc",
                edat = 20
            ),
            AlumneModel(
                nom = "Eduard",
                edat = 20
            ),
            AlumneModel(
                nom = "Pau",
                edat = 18
            ),
            AlumneModel(
                nom = "Sergi",
                edat = 19
            ),
            AlumneModel(
                nom = "Marti",
                edat = 19
            )

        )
    }
}


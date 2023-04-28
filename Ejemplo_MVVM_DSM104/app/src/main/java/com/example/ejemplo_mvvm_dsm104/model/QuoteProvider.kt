package com.example.ejemplo_mvvm_dsm104.model

class QuoteProvider {
companion object{


    fun random():QuoteModel{

        val position=(0..9).random()

        return quote[position]

    }


    private val quote = listOf<QuoteModel>(


        QuoteModel(
            quote="Parece, cuando se ama, que el mundo entero tiene rumor de primavera",
            author="Juan Ramón Jiménez"

        ),


        QuoteModel(
            quote="Y he llegado a la conclusión de que si las cicatrices enseñan, las caricias también",
            author="Mario Benedetti"

        ),


        QuoteModel(
            quote="El prejuicio es una carga que confunde el pasado, amenaza el futuro y hace inaccesible el presente ",
            author="Maya Angelou"

        ),


        QuoteModel(
            quote="El libro es fuerza, es valor, es poder, es alimento, antorcha del pensamiento y manantial del amor ",
            author="Rubén Darío"

        ),


        QuoteModel(
            quote="La duda es uno de los nombres de la inteligencia ",
            author="Jorge Luis Borges"

        ),


        QuoteModel(
            quote="El alma que hablar puede con los ojos también puede besar con la mirada",
            author="Gustavo Adolfo Bécquer"

        ),


        QuoteModel(
            quote="Nada es real hasta que se experimenta, aún un proverbio no lo es hasta que la vida lo haya ilustrado",
            author="John Keats"

        ),


        QuoteModel(
            quote="No dejes de creer que las palabras y las poesías sí pueden cambiar el mundo",
            author="Walt Whitman"

        ),


        QuoteModel(
            quote="Las palabras abren puertas sobre el mar",
            author="Rafael Alberti"

        ),


        QuoteModel(
            quote="La poesía no quiere adeptos, quiere amantes ",
            author="Federico García Lorca"

        )






    )
}

}
fun main(){
    for(i in 1..5){
        println(i)
    }
    println("--------")
    for(i in 1 until 5){
        println(i)
    }
    println("--------")
    for(i in 1 until 10 step 2){
        println(i)
    }
    println("--------")

    val nombres = listOf(
        "Kirby",
        "Ness",
        "Fox",
        "Luigi",
        "Mario",
        "Link",
        "Captain Falcon",
        "Samus",
        "Pikachu",
        "Jigglypuff",
        "Donkey Kong",
        "Yoshi"
    )

    for (nombre in nombres){
        println(nombre)
    }

    println("--------*")
    nombres.forEach{personaje->
        println(personaje)
    }

    //While
    println("----")
    var x = 5
    while (x > 0) {
        println(x)
        x--
    }
}
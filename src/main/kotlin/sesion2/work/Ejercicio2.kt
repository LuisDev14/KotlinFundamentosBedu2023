fun main(){
    //verifyAge()
    gradoEscolar()
}

fun gradoEscolar(){
    println("Ingresa un grado escolar ")
    val age = readLine()!!.toInt()
    val mensaje = when(age){
        0 -> "Eres recien nacido"
        1 -> "Solo tienes un año"
        in 2..5 -> "Preescolar"
        in 6..11 -> "Primaria"
        in 12..14 -> "Secundaria"
        in 15..17 -> "Bachilleres"
        else -> {
            print("no es ninguna opcion")
        }
    }
    println(mensaje)
}
fun verifyAge(){
    println("Ingresa edad y presiona enter: ")
    val age = readLine()!!.toInt()
    val mensaje = if(age >=18) "ya eres mayor de edad" else "Eres menor de edad"
}

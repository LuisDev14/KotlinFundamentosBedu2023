fun main(){
    val a=2
    val b=5
    println(a+b)

    fun saludar(){
        println("Hola Mundo")
    }
    saludar()

    fun saludar1(nombre:String): String{
        return "Hola $nombre"
    }
    val saludar1 = saludar1("Luis")
    println(saludar1)
    println(saludar1("Luis Manuel"))

    //Cuando una función retorna una sola expresión, es decir, una expresión de una sola línea, las llaves {} pueden ser omitidas y el cuerpo de la función se define después del signo =
    fun sumar(a:Int,b:Int):Int = a+b
    println(sumar(5,1))
    //Top Level functions
    /*
    fun saludar(nombre: String) {
        println("Hola $nombre")
    }
    class Persona constructor(nombre: String) {
        fun decirHola() {
            saludar(nombre)
        }
    }
    */


    //Local Functions
    /*
    fun saludar(nombre: String) {
        fun crearSaludo(nombreParaSaludo: String): String {
            return "Hola $nombreParaSaludo"
        }
        println(crearSaludo(nombre))
    }
    */

    val c = 5
    val d = 4
    var max = 0
    //if(c > d) max = c
    //println("valor de max $max")
    if (c > d){
        max = c
    }else{
        max = d
    }
    //println("valor de max $max")

    //Usando if como una expresión.
    max = if(c > d) c else d
    println("valor de max $max")

    //expresion when, en vez de switch
    val x = 1
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            print("x no es ni 1 ni 2")
        }
    }
    //Si varios casos se tienen que evaluar de la misma manera, estos pueden ser combinados con comas
    when (x) {
        0, 1 -> println("x == 0 o x == 1")
        else -> println("ninguno")
    }

    //También podemos hacer uso del operador In para determinar si un elemento está contenido en otro.
    /*
    when (x) {
        in 1..10 -> print("x esta en el rango")
        in validNumbers -> print("x es valido")
        !in 10..20 -> print("x no esta en el rango")
        else -> print("ninguno")
    }
    */

    //Ciclos for

    var nombres = arrayOf("Nombre Uno", "Nombre dos", "Nombre tres", "Nombre cuatro", "Nombre cinco", "Nombre seis")
    for ((index, value) in nombres.withIndex()) nombres[index] += "."
    //podemos iterar un rango de numeros de la siguiente forma
    for (i in 1..3) {
        println(i)
    }
    println("fin de primer ciclo for")
    for (j in 2..10){
        println(j)
    }
    println("fin del segundo ciclo for")

    //while
    /*
    val k = 1
    while (k > 0) {
        k--
    }
    */

    //do while
    /*

    do {
        val y = obtenerDatos()
    } while (y != null)

     */


}

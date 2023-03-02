import kotlin.math.pow
const val PI = 3.1416f

fun String.getLastChar() = this.get(this.length-1)
fun main(){
    println("Bedu".getLastChar())
    println("Adios".getLastChar())
    val area = circleArea(2.3f)
    println(area)

    val area2 = circleArea(2.6f)
    println(area2)

    holaMundo()
    println(login("",""))
}
fun login(user:String,password:String):Boolean{
    fun validate(input:String) = input.isNotEmpty()
    val userValidated =validate(user)
    val passwordValidated = validate(password)
    return userValidated && passwordValidated
}
/*
fun circleArea(radius:Float):Float{
    return  PI*radius.pow(2)
}
 */

fun circleArea(radius:Float) = PI*radius.pow(2)
fun holaMundo(){
    println("hola mundo")
}

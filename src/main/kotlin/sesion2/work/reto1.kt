
//1.- Crear una función que calcule el área de un rectángulo por medio de su base y altura, implementarla en main
fun main(){
    val base = 20.2f
    val altura = 10.2f
    val area  = areaRec(base,altura)
    println("el area del rectangulo es $area")


    val ancho = 2f
    val volumen = volumenPrisma(base,altura,ancho)
    println("el volumen del prisma es $volumen")
}
fun areaRec(base:Float,altura:Float):Float{
    return  base * altura
}
//2.-Crear otra función para calcular el volumen de un prisma rectangular, utilizar la función de área
fun volumenPrisma(base: Float, altura:Float, ancho: Float):Float{
    return areaRec(base,altura)*ancho
}
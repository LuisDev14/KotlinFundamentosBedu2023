package sesion3.work.clases
enum class Color(val colorCode: Int){
    RED(0xFF0000),
    BLACK(0x000000),
    BLUE(0x0000FF),
    WHITE(0xFFFFFF),
}
class Vehiculo {
    var color= Color.BLACK
    var marca = ""
    var modelo = ""
    var placas = ""
    var gasolina = 0f
    var encendido = false


    fun encender(){
        encendido=true
    }

    fun apagar(){
        encendido=false
    }

    fun recargar(litros:Float){
        gasolina+=litros
    }
}
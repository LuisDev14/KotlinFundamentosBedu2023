package sesion3.work.retos

class Vehiculo {
    // coloca aquí los atributos
    var color= ""
    var marca = ""
    var modelo = ""
    var placas = ""
    var gasolina = 0f
    var encendido = false
    companion object {
        @JvmStatic fun main(args: Array<String>){

            val miVehiculo = Vehiculo()

            miVehiculo.color="Verde"
            miVehiculo.marca="Ford"
            miVehiculo.modelo="Focus"
            miVehiculo.placas="REM-4123"

            println("El coche está prendido? ${miVehiculo.encendido}")
            miVehiculo.encender()
            println("El coche está prendido? ${miVehiculo.encendido}")

            println("El tanque tiene ${miVehiculo.gasolina}")
            miVehiculo.recargar(20.07f)
            println("El tanque tiene ${miVehiculo.gasolina}")

        }
    }
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



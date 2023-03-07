package sesion3.work

class phone {
    var isOn = false
    lateinit var model:String
    companion object {
        @JvmStatic fun main(vararg input: String) {
            val number = 35
            //println("numero es igual a 35? ${number.equals(35)}")
            val myPhone = phone()
            println(myPhone.getTurn())
            myPhone.turnOn()
            println(myPhone.getTurn())
        }
    }
    //metodos
    //seteamos el valor prendido
    //setters
    fun turnOn(){
        isOn = true
    }
    //seteamos el valor apagado
    fun turnOf(){
        isOn = false
    }
    //getter
    fun getTurn() = if (isOn) "Encendido" else "apagado"
}
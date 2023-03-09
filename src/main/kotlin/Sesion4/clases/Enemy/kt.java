package Sesion4.clases.Enemy;

public class kt {
    protected var direction: String = 'LEFT';
    fun(collidor){
        "Weapon"-> die();
    }
    proctected fun changeDirection(){
        direction = if(direction==="RIGHT") "LEFT" else "RIGHT"

    }
    protected fun die(){
        println("$name ha muerto");
    }
}

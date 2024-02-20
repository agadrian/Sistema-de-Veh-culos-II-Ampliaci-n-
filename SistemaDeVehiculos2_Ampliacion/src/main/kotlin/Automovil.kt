/**
 * Clase que representa un automóvil.
 * @property esElectrico Indica si el automóvil es eléctrico (true) o no (false). En caso de serlo, seria hibrido
 * @property condicionBritanica Indica si el automóvil está configurado para conducción británica (true) o no (false). (Volante a la derecha)
 *
 * @constructor Crea un nuevo automóvil con los siguientes parámetros:
 * @param marca La marca del automóvil.
 * @param modelo El modelo del automóvil.
 * @param capacidadCombustible La capacidad total del tanque de combustible del automóvil en litros.
 * @param combustibleActual La cantidad actual de combustible en el tanque del automóvil en litros.
 * @param kilometrosActuales El total de kilómetros recorridos por el automóvil.
 */
class Automovil(val esElectrico: Boolean,  var condicionBritanica: Boolean, marca: String, modelo: String, capacidadCombustible: Float, combustibleActual: Float, kilometrosActuales: Int) : Vehiculo(marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales) {


    override fun calcularAutonomia(): Int {
        return if (esElectrico) {
            (super.calcularAutonomia() * 1.5).toInt()
        }else{
            (super.calcularAutonomia())
        }
    }

    /**
     * Método de clase que permite modificar la configuración de conducción británica para todos los automóviles.
     *//*
    companion object{
        fun cambiarCondicionBritanica(condnuevaCondicion: Boolean){
            var condicionBritanica: Boolean
            condicionBritanica = nuevaCondicion
        }
    }*/

    /**
     * método que simula un derrape. Realiza una gasto adicional en el combustible retornando el combustible restante. El gasto equivale a haber realizado 5 kilómetros.
     */
    fun realizarDerrape(): Float{
        println("Has derrapao")
        combustibleActual -= 1f

        return combustibleActual
    }

    override fun toString(): String {
        return super.toString() + " ; EsElectrico: $esElectrico ; CondicionBritanica: $condicionBritanica ; Autonomia: ${calcularAutonomia()}"
    }

}
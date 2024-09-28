package app.android.calculadora

class Calculadora(
    private var listaNumeroUno: MutableList<Int> = mutableListOf(),
    private var listaNumeroDos: MutableList<Int> = mutableListOf(),
    private var ecuacionUno:Int,
    private var ecuacionDos:Int,
    private var resultado:Int)
 {

    fun digitarNumeroUno(numeros:Int):Int{
        listaNumeroUno.add(numeros)
        ecuacionUno= listaNumeroUno.joinToString("").toInt()
        return ecuacionUno
    }

    fun digitarNumeroDos(numeros:Int):Int{
        listaNumeroDos.add(numeros)
        ecuacionDos= listaNumeroDos.joinToString("").toInt()
        return  ecuacionDos
    }
    fun mostrarEcuacionUno():String{
        return ecuacionUno.toString()
    }
    fun mostrarEcuacionDos():String{
        return ecuacionDos.toString()
    }
    fun sumar():Int{
        resultado=ecuacionUno+ecuacionDos
        ecuacionUno=resultado
        listaNumeroDos.clear()
        ecuacionDos=0
        return ecuacionUno
    }
    fun restar():Int{
        resultado=ecuacionUno-ecuacionDos
        ecuacionUno=resultado
        listaNumeroDos.clear()
        ecuacionDos=0
        return ecuacionUno
    }
     fun multiplicar(): Int {
         resultado = ecuacionUno * ecuacionDos
         ecuacionUno = resultado
         listaNumeroDos.clear()
         ecuacionDos = 1
         return ecuacionUno
     }

     fun dividir():Int{
         resultado=ecuacionUno/ecuacionDos
         return resultado
     }

    fun limpiar(){
        listaNumeroUno.clear()
        listaNumeroDos.clear()
        ecuacionUno=0
        ecuacionDos=0

    }
}
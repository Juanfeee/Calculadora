package app.android.calculadora

import android.os.Bundle
import android.util.Log
import android.widget.Switch
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import app.android.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var listaNumeroUno:MutableList<Int> = mutableListOf()
    var listaNumeroDos:MutableList<Int> = mutableListOf()
    var ecuacionUno:Int=0
    var ecuacionDos:Int=0
    var resultado:Int=0
    var signo:String=""
    var calculadora:Calculadora= Calculadora(listaNumeroUno,listaNumeroDos,ecuacionUno,ecuacionDos,resultado)

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding= ActivityMainBinding.inflate(layoutInflater)
            enableEdgeToEdge()
            setContentView(binding.root)

            numerosEcuacionUno(binding,calculadora)

            //Limpiar las ecuaciones
            binding.btnLimpiar.setOnClickListener {
                calculadora.limpiar()
                resetearValores()
                numerosEcuacionUno(binding,calculadora)
            }
            //Aqui sumamos
            binding.btnSuma.setOnClickListener {
                calculadora.sumar()
                signo="+"
                binding.txtSigno.text= signo
                binding.txtNumeros.text= (calculadora.mostrarEcuacionUno())
                numerosEcuacionDos(binding,calculadora)
            }
            binding.btnResta.setOnClickListener {
                calculadora.restar()
                signo="-"
                binding.txtSigno.text= signo
                numerosEcuacionDos(binding,calculadora)
                binding.txtNumeros.text= (calculadora.mostrarEcuacionUno())
            }
            binding.btnMultiplicacion.setOnClickListener {
                numerosEcuacionDos(binding,calculadora)
                signo="*"
                binding.txtSigno.text= signo
                binding.txtNumeros.text= (calculadora.mostrarEcuacionUno())
            }
            binding.btnDivision.setOnClickListener {
                numerosEcuacionDos(binding,calculadora)
                signo="/"
                binding.txtSigno.text= signo
                binding.txtNumeros.text= (calculadora.mostrarEcuacionUno())
            }
            binding.btnIgual.setOnClickListener {
                when(signo){
                    "+" -> binding.txtNumeros.text= calculadora.sumar().toString()
                    "-" -> binding.txtNumeros.text= calculadora.restar().toString()
                    "*" -> binding.txtNumeros.text= calculadora.multiplicar().toString()
                    "/" -> binding.txtNumeros.text= calculadora.dividir().toString()
                }
            }
        }

    //Funcion resetear ecuaciones
    private fun resetearValores() {
        binding.txtEcuacion.text="0"
        binding.txtNumeros.text="0"
        binding.txtSigno.text=""


    }
}
    //Para poder reutilizarlo mas tarde
    fun numerosEcuacionDos(binding: ActivityMainBinding, calculadora: Calculadora){
        binding.btnNumero0.setOnClickListener {
            calculadora.digitarNumeroDos(0)
            binding.txtEcuacion.text= (calculadora.mostrarEcuacionDos())

        }
        binding.btnNumero1.setOnClickListener {
            calculadora.digitarNumeroDos(1)
            binding.txtEcuacion.text= (calculadora.mostrarEcuacionDos())

        }
        binding.btnNumero2.setOnClickListener {
            calculadora.digitarNumeroDos(2)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionDos()

        }
        binding.btnNumero3.setOnClickListener {
            calculadora.digitarNumeroDos(3)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionDos()

        }
        binding.btnNumero4.setOnClickListener {
            calculadora.digitarNumeroDos(4)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionDos()

        }
        binding.btnNumero5.setOnClickListener {
            calculadora.digitarNumeroDos(5)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionDos()

        }
        binding.btnNumero6.setOnClickListener {
            calculadora.digitarNumeroDos(6)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionDos()

        }
        binding.btnNumero7.setOnClickListener {
            calculadora.digitarNumeroDos(7)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionDos()

        }
        binding.btnNumero8.setOnClickListener {
            calculadora.digitarNumeroDos(8)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionDos()

        }
        binding.btnNumero9.setOnClickListener {
            calculadora.digitarNumeroDos(9)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionDos()

        }
    }

    //Para no repetir
    fun numerosEcuacionUno(binding: ActivityMainBinding, calculadora: Calculadora){
        binding.btnNumero0.setOnClickListener {
            calculadora.digitarNumeroUno(0)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionUno()

        }
        binding.btnNumero1.setOnClickListener {
            calculadora.digitarNumeroUno(1)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionUno()

        }
        binding.btnNumero2.setOnClickListener {
            calculadora.digitarNumeroUno(2)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionUno()

        }
        binding.btnNumero3.setOnClickListener {
            calculadora.digitarNumeroUno(3)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionUno()

        }
        binding.btnNumero4.setOnClickListener {
            calculadora.digitarNumeroUno(4)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionUno()

        }
        binding.btnNumero5.setOnClickListener {
            calculadora.digitarNumeroUno(5)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionUno()

        }
        binding.btnNumero6.setOnClickListener {
            calculadora.digitarNumeroUno(6)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionUno()

        }
        binding.btnNumero7.setOnClickListener {
            calculadora.digitarNumeroUno(7)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionUno()

        }
        binding.btnNumero8.setOnClickListener {
            calculadora.digitarNumeroUno(8)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionUno()

        }
        binding.btnNumero9.setOnClickListener {
            calculadora.digitarNumeroUno(9)
            binding.txtEcuacion.text= calculadora.mostrarEcuacionUno()

        }
    }

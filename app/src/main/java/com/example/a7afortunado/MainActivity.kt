package com.example.a7afortunado

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var cont:Int=0


        btnGenerar.setOnClickListener {
            var aleatorio = Random()
            val nr1:Int = aleatorio.nextInt(10)
            val nr2:Int = aleatorio.nextInt(10)
            val nr3:Int = aleatorio.nextInt(10)

            if (cont==3)
            {
               var buildre = AlertDialog.Builder(this)
                buildre.setTitle("Has Perdido!")
                buildre.setMessage("¿Quieres Jugar de nevo?")
                buildre.setPositiveButton("SI") { dialogInterface: DialogInterface, i: Int ->
                    cont = 0
                    imgn1?.setImageResource(R.drawable.cero)
                    imgn2?.setImageResource(R.drawable.cero)
                    imgn3?.setImageResource(R.drawable.cero)
                }
                buildre.setNegativeButton("No") { dialogInterface: DialogInterface, i: Int ->
                    finish()
                }
                buildre.show()
            }
            else
            {
                if (nr1==7&&nr2==7&&nr3==7)
                {
                    generarImagen(nr1,nr2,nr3)
                    var builder = AlertDialog.Builder(this)
                    builder.setTitle("Has Ganado!")
                    builder.setMessage("¿Quieres Jugar de nevo?")
                    builder.setPositiveButton("SI") { dialogInterface: DialogInterface, i: Int ->
                        cont = 0
                        imgn1?.setImageResource(R.drawable.cero)
                        imgn2?.setImageResource(R.drawable.cero)
                        imgn3?.setImageResource(R.drawable.cero)
                    }
                    builder.setNegativeButton("No") { dialogInterface: DialogInterface, i: Int ->
                        finish()
                    }
                    builder.show()
                }
                else
                {
                    generarImagen(nr1,nr2,nr3)
                    cont=cont+1
                }
            }
        }


    }




    fun generarImagen(n1:Int,n2:Int,n3:Int)
    {
        if (n1==0)
        {
            imgn1?.setImageResource(R.drawable.cero)
        }
        if (n1==1)
        {
            imgn1?.setImageResource(R.drawable.uno)
        }
        if (n1==2)
        {
            imgn1?.setImageResource(R.drawable.dos)
        }
        if (n1==3)
        {
            imgn1?.setImageResource(R.drawable.tres)
        }
        if (n1==4)
        {
            imgn1?.setImageResource(R.drawable.cuatro)
        }
        if (n1==5)
        {
            imgn1?.setImageResource(R.drawable.cinco)
        }
        if (n1==6)
        {
            imgn1?.setImageResource(R.drawable.seis)
        }
        if (n1==7)
        {
            imgn1?.setImageResource(R.drawable.siete)
        }
        if (n1==8)
        {
            imgn1?.setImageResource(R.drawable.ocho)
        }
        if (n1==9)
        {
            imgn1?.setImageResource(R.drawable.nueve)
        }

        //numero 2
        if (n2==0)
        {
            imgn2?.setImageResource(R.drawable.cero)
        }
        if (n2==1)
        {
            imgn2?.setImageResource(R.drawable.uno)
        }
        if (n2==2)
        {
            imgn2?.setImageResource(R.drawable.dos)
        }
        if (n2==3)
        {
            imgn2?.setImageResource(R.drawable.tres)
        }
        if (n2==4)
        {
            imgn2?.setImageResource(R.drawable.cuatro)
        }
        if (n2==5)
        {
            imgn2?.setImageResource(R.drawable.cinco)
        }
        if (n2==6)
        {
            imgn2?.setImageResource(R.drawable.seis)
        }
        if (n2==7)
        {
            imgn2?.setImageResource(R.drawable.siete)
        }
        if (n2==8)
        {
            imgn2?.setImageResource(R.drawable.ocho)
        }
        if (n2==9)
        {
            imgn2?.setImageResource(R.drawable.nueve)
        }

        //numero 3
        if (n3==0)
        {
            imgn3?.setImageResource(R.drawable.cero)
        }
        if (n3==1)
        {
            imgn3?.setImageResource(R.drawable.uno)
        }
        if (n3==2)
        {
            imgn3?.setImageResource(R.drawable.dos)
        }
        if (n3==3)
        {
            imgn3?.setImageResource(R.drawable.tres)
        }
        if (n3==4)
        {
            imgn3?.setImageResource(R.drawable.cuatro)
        }
        if (n3==5)
        {
            imgn3?.setImageResource(R.drawable.cinco)
        }
        if (n3==6)
        {
            imgn3?.setImageResource(R.drawable.seis)
        }
        if (n3==7)
        {
            imgn3?.setImageResource(R.drawable.siete)
        }
        if (n3==8)
        {
            imgn3?.setImageResource(R.drawable.ocho)
        }
        if (n3==9)
        {
            imgn3?.setImageResource(R.drawable.nueve)
        }
    }
}
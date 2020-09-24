package com.example.calculatrice_version_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtResultat = findViewById<TextView>(R.id.result)
        val btn_ceanAll = findViewById<Button>(R.id.cleanAll)
        val btn_div = findViewById<Button>(R.id.division)
        val btn_multi = findViewById<Button>(R.id.multiplication)
        val btn_delete = findViewById<Button>(R.id.delete)
        val btn_mod = findViewById<Button>(R.id.modulo)
        val btn_sustraction = findViewById<Button>(R.id.sustration)
        val btn_add = findViewById<Button>(R.id.addition)
        val btn_egal = findViewById<Button>(R.id.egale)
        val btn_0 = findViewById<Button>(R.id.zero)
        val btn_1 = findViewById<Button>(R.id.un)
        val btn_2 = findViewById<Button>(R.id.deux)
        val btn_3 = findViewById<Button>(R.id.trois)
        val btn_4 = findViewById<Button>(R.id.quatre)
        val btn_5 = findViewById<Button>(R.id.cinq)
        val btn_6 = findViewById<Button>(R.id.six)
        val btn_7 = findViewById<Button>(R.id.sept)
        val btn_8 = findViewById<Button>(R.id.huit)
        val btn_9 = findViewById<Button>(R.id.neuf)
        val btn_unnaire = findViewById<Button>(R.id.moinsUnaire)




    }
}
package com.dianaditya.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dianaditya.recyclerview.adapter.AdapterTeamBola
import com.dianaditya.recyclerview.databinding.ActivityMainBinding
import com.dianaditya.recyclerview.model.Pemain

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listPemain = ArrayList<Pemain>()
        listPemain.add(Pemain("Benjamin White",R.drawable.benjamin,"Bek Tengah","1,92 m","Poole (Inggris)","8 Oktober 1997"))
        listPemain.add(Pemain("Bukayo Saka",R.drawable.saka,"Penyerang Sayap Kanan","1,75 m","Ealing (Inggris)","5 September 2001"))
        listPemain.add(Pemain("Martin Odegaard",R.drawable.odegaard,"Gelandang Serang","1,80 m","Drammen (Norwegia)","17 Desember 1998"))
        listPemain.add(Pemain("Mohamed Elneny",R.drawable.elneny,"Gelandang Bertahan","1,75 m","El Mahala El Kubra (Mesir)","11 Juli 1992"))
        listPemain.add(Pemain("Gabriel Jesus",R.drawable.jesus,"Stiker","1,75 m","Sao Paulo (Brazil)","3 April 1997"))


    binding.List.adapter = AdapterTeamBola(this,listPemain,object : AdapterTeamBola.OnClickListener{
        override fun detailData(item: Pemain?) {
            TODO("Not yet implemented")
        }

    } )
    }

}
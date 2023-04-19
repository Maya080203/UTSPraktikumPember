package com.example.uts_praktikumpember

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_praktikumpember.ClsAdapter
import com.example.uts_praktikumpember.Datapeserta
import com.example.uts_praktikumpember.R

class MainActivity2 : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: ClsAdapter
    lateinit var listData: ArrayList<Datapeserta>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recycle = findViewById(R.id.idrecycle)
        listData = ArrayList()

        val layoutManager = GridLayoutManager(this, 1)
        recycle.layoutManager = layoutManager
        recycleAdapter = ClsAdapter(listData, this)

        recycle.adapter = recycleAdapter
        listData.add(Datapeserta("Dinda Sakira", "210441100116", "18 Tahun", R.drawable.foto1))
        listData.add(Datapeserta("Siska Abelia", "210441100115", "20 tahun", R.drawable.foto2))
        listData.add(Datapeserta("Angel Lauren", "210441100114", "17 tahun", R.drawable.foto3))
        listData.add(Datapeserta("Clarischa Wiliew", "210441100113", "19 tahun", R.drawable.foto4))
        listData.add(Datapeserta("Putri Santiya", "210441100112", "21 tahun", R.drawable.foto5))
        listData.add(Datapeserta("Alexia Mahendra", "210441100126", "18 Tahun", R.drawable.foto6))
        listData.add(Datapeserta("Manda Alerga", "210441100115", "17 tahun", R.drawable.foto7))
        listData.add(Datapeserta("Cellyn Gantara", "210441100114", "20 tahun", R.drawable.foto8))
        listData.add(Datapeserta("Bunga Safira", "210441100113", "19 tahun", R.drawable.foto9))
        listData.add(Datapeserta("Meisya Roulan", "210441100112", "21 tahun", R.drawable.foto10))
        listData.add(Datapeserta("Safira Alexandra", "210441100121","20 Tahun",R.drawable.foto11))
        listData.add(Datapeserta("Claudia Fitri", "210441100049", "18 tahun", R.drawable.foto12))
        listData.add(Datapeserta("Dara Cornia", "210441100035", "19 tahun", R.drawable.foto13))
        listData.add(Datapeserta("Rania Figro", "210441100046", "20 tahun", R.drawable.foto14))
        listData.add(Datapeserta("Cindy Maytay", "210441100070", "18 Tahun", R.drawable.foto15))
        listData.add(Datapeserta("Dinda Gayatri", "210441100123", "19 tahun", R.drawable.foto16))
        listData.add(Datapeserta("Wina Zoiyna", "210441100014", "21 tahun", R.drawable.foto17))
        listData.add(Datapeserta("Vina Dindro", "210441100134", "19 tahun", R.drawable.foto18))
        listData.add(Datapeserta("Miysya Queni", "210441100152", "20 tahun", R.drawable.foto19))
        listData.add(Datapeserta("Angel Vinopatri", "210441100161","20 Tahun",R.drawable.foto20))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.action_grid ->{
                startActivity(Intent(this@MainActivity2, MainActivity::class.java))
                true
            }
            else ->return super.onOptionsItemSelected(item)
        }
        return super.onOptionsItemSelected(item)
    }
}

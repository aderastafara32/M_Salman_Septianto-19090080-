package com.salman.gridlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.salman.gridlayout.adapter.AlphaAdapters
import com.salman.gridlayout.model.AlphaChar

class MainActivity : AppCompatActivity() {
    private var recyclerView:RecyclerView?=null
    private var gridLayoutManager:GridLayoutManager?=null
    private var arrayList:ArrayList<AlphaChar>?=null
    private var alphaAdapters:AlphaAdapters?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.my_recycle_view)
        gridLayoutManager=
            GridLayoutManager(applicationContext,3,LinearLayoutManager.VERTICAL,false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList()
        alphaAdapters= AlphaAdapters(applicationContext,arrayList!!)
        recyclerView?.adapter=alphaAdapters
    }

    private fun setDataInList() :ArrayList<AlphaChar>{

        var items:ArrayList<AlphaChar> = ArrayList()
        items.add(AlphaChar(R.drawable.gambyong,"Tari Gambyong"))
        items.add(AlphaChar(R.drawable.giring,"Tari Giring"))
        items.add(AlphaChar(R.drawable.jaipong,"Tari Jaipong"))
        items.add(AlphaChar(R.drawable.kecak,"Tari Kecak"))
        items.add(AlphaChar(R.drawable.kipas,"Tari Kipas"))
        items.add(AlphaChar(R.drawable.img,"pewayangan"))

        return items
    }
 }
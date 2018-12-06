package com.example.sz94n.networking

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_city.view.*

class CityAdapter : RecyclerView.Adapter<CityAdapter.CityViewHolder>{
    override fun onCreateViewHolder(parent: ViewGroup,  type: Int): CityAdapter.CityViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_city,parent,false)
        return CityViewHolder(view)

    }

    override fun getItemCount(): Int {
        return cityList.size
    }

    override fun onBindViewHolder(p0: CityAdapter.CityViewHolder, p1: Int) {
        p0.setCity(cityList[p1])
    }

    val cityList:List<City>
    constructor(cityList: List<City>){
        this.cityList=cityList
    }


    class CityViewHolder:RecyclerView.ViewHolder {
        val view: View
        constructor(view:View):super(view){
            this.view=view
        }
        fun setCity(city:City){
            view.cityTitleTextView.text =city.title
        }
    }





}
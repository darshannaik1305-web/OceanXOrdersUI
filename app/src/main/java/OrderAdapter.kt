package com.example.oceanxorders

import OrderModel
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OrderAdapter(private val orderList: List<OrderModel>) :
    RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {

    class OrderViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val vehicle: TextView = view.findViewById(R.id.txtVehicle)
        val orderId: TextView = view.findViewById(R.id.txtOrderId)
        val location: TextView = view.findViewById(R.id.txtLocation)
        val price: TextView = view.findViewById(R.id.txtPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_order, parent, false)

        return OrderViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {

        val order = orderList[position]

        holder.vehicle.text = order.vehicle
        holder.orderId.text = order.orderId
        holder.location.text = order.location
        holder.price.text = order.price
    }

    override fun getItemCount(): Int {
        return orderList.size
    }
}
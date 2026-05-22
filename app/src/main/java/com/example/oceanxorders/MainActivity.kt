package com.example.oceanxorders

import OrderModel
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {



    @Suppress("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val btnFilter = findViewById<Button>(R.id.btnFilter)
        val btnSort = findViewById<Button>(R.id.btnSort)

        btnFilter.setOnClickListener {
            Toast.makeText(this, "Filter Clicked", Toast.LENGTH_SHORT).show()
        }

        btnSort.setOnClickListener {
            Toast.makeText(this, "Sort Clicked", Toast.LENGTH_SHORT).show()
        }

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        tabLayout.addTab(tabLayout.newTab().setText("All Orders"))
        tabLayout.addTab(tabLayout.newTab().setText("Completed"))
        tabLayout.addTab(tabLayout.newTab().setText("Cancelled"))
        tabLayout.addTab(tabLayout.newTab().setText("Booked Again"))
        val orderList = listOf(

            OrderModel(
                "Four Wheeler",
                "#ORD12345",
                "Jhansi, India",
                "₹229"
            ),

            OrderModel(
                "Four Wheeler",
                "#ORD12346",
                "Madhya Pradesh",
                "₹1515"
            ),

            OrderModel(
                "Four Wheeler",
                "#ORD12347",
                "Kamrari, India",
                "₹1634"
            )

        )

        recyclerView.adapter = OrderAdapter(orderList)
    }
}
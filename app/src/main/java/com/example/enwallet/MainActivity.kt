package com.example.enwallet

import ExpenditureOverView
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enwallet.databinding.ActivityMainBinding
import enwalletAdapter

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallet.layoutManager = LinearLayoutManager(this)
        displayActivity()

    }
    fun displayActivity(){
        val activity1 = ExpenditureOverView("","Salary" ,"KES 40000", "1 July 2024")
        val activity2 = ExpenditureOverView("", "Rent","KES 16000", "2 July 2024")
        val activity3 = ExpenditureOverView("", "Dividends","KES 16000", "2 July 2024")
        val activity4 = ExpenditureOverView("", "Electricity","KES 16000", "2 July 2024")
        val activity5 = ExpenditureOverView("", "Internet","KES 16000", "2 July 2024")
        val activity6 = ExpenditureOverView("", "Shopping","KES 16000", "2 July 2024")
        val activity7 = ExpenditureOverView("", "Bus Fare","KES 16000", "2 July 2024")
        val activity8 = ExpenditureOverView("", "Water Bill","KES 16000", "2 July 2024")
        val activity9 = ExpenditureOverView("", "Salary","KES 16000", "2 July 2024")
        val activity10 =ExpenditureOverView("", "Rent","KES 16000", "2 July 2024")
        val transactionsactivity = listOf(activity1,activity2,activity3,activity4,activity5,activity6,activity7,activity8,activity9,activity10)
        val overView = enwalletAdapter(transactionsactivity )

        binding.rvWallet.adapter = overView
    }
}
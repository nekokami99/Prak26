package com.xbach.prak26

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: RandomViewModel
    private lateinit var edtRndNum: EditText
    private lateinit var btnGetRnd: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()

        val provider = ViewModelProvider(this)
        viewModel = provider.get(RandomViewModel::class.java)

        observeViewModel()

        btnGetRnd.setOnClickListener {
            viewModel.randomNum()
        }
    }

    private fun observeViewModel() {
        viewModel.number.observe(this, Observer {
            edtRndNum.setText(it.toString())
        })
    }

    private fun initUI() {
        edtRndNum = findViewById(R.id.rndNum)
        btnGetRnd = findViewById(R.id.getRnd)
    }
}

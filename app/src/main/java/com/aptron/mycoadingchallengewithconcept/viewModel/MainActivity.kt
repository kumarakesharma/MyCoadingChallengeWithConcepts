package com.aptron.mycoadingchallengewithconcept.viewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.aptron.mycoadingchallengewithconcept.R
import com.aptron.mycoadingchallengewithconcept.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java);

        binding.tvCounter.text = viewModel.getCurrentCount().toString()

        binding.btnClick.setOnClickListener {
            binding.tvCounter.text = viewModel.getUpdatedCount().toString()
        }
    }
}
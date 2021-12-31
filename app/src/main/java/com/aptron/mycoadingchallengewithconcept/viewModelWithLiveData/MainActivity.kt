package com.aptron.mycoadingchallengewithconcept.viewModelWithLiveData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.aptron.mycoadingchallengewithconcept.R
import com.aptron.mycoadingchallengewithconcept.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity()/*, View.OnClickListener */{
    lateinit var binding : ActivityMain2Binding
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]
        binding.myViewModel = viewModel
        binding.lifecycleOwner = this
    }
}
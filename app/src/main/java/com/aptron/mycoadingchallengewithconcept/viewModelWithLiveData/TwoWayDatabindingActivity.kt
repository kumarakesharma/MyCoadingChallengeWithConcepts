package com.aptron.mycoadingchallengewithconcept.viewModelWithLiveData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.aptron.mycoadingchallengewithconcept.R
import com.aptron.mycoadingchallengewithconcept.databinding.ActivityTwoWayDatabindingBinding

class TwoWayDatabindingActivity : AppCompatActivity() {
    lateinit var binding : ActivityTwoWayDatabindingBinding
    lateinit var viewModel : TwoWayDatabindingViewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_databinding)
        viewModel = ViewModelProvider(this)[TwoWayDatabindingViewmodel::class.java]
        binding.myViewModel = viewModel
        binding.lifecycleOwner = this
    }
}
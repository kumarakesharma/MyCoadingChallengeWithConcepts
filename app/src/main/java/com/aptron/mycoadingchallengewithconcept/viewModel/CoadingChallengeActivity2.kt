package com.aptron.mycoadingchallengewithconcept.viewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.aptron.mycoadingchallengewithconcept.R
import com.aptron.mycoadingchallengewithconcept.databinding.ActivityCoadingChallenge2Binding

class CoadingChallengeActivity2 : AppCompatActivity() {
    lateinit var binding : ActivityCoadingChallenge2Binding
    lateinit var viewModel: CoadingChallengeActivity2Model
    lateinit var viewModelFactory: CoadingChallengeActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_coading_challenge2)
        viewModelFactory = CoadingChallengeActivityViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory)[CoadingChallengeActivity2Model::class.java]

//        binding.tvAddResult.text = viewModel.getCurrentCount().toString()
        //TODO : Using LiveData
        /*
        viewModel.total.observe(this, Observer {
            binding.tvAddResult.text = it.toString()
        })*/

        // TODO : Accessing lived data private members
        viewModel.totalData.observe(this, Observer {
            binding.tvAddResult.text = it.toString()
        })

        binding.btnAdd.setOnClickListener {
//            binding.tvAddResult.text = viewModel.updatedCount(binding.etInputNumber.text.toString().toInt()).toString()
            // TODO : With LiveData
            viewModel.updatedCount(binding.etInputNumber.text.toString().toInt()).toString()
        }
    }
}
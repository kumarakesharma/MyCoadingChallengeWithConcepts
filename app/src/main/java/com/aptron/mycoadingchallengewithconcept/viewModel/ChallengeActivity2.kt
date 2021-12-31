package com.aptron.mycoadingchallengewithconcept.viewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.aptron.mycoadingchallengewithconcept.R
import com.aptron.mycoadingchallengewithconcept.databinding.ActivityChallenge2Binding

class ChallengeActivity2 : AppCompatActivity(), View.OnClickListener {
    lateinit var binding: ActivityChallenge2Binding
    lateinit var viewModelFactory: ChallengeActivity2ViewmodelFactory
    lateinit var viewModel: ChallengeActivityViewModel2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_challenge2)
        viewModelFactory = ChallengeActivity2ViewmodelFactory(0)
        viewModel =
            ViewModelProvider(this, viewModelFactory)[ChallengeActivityViewModel2::class.java]

        viewModel.totalCount.observe(this, Observer {
            binding.tvResult.text = it.toString()
        })
        binding.btnClick.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var count = viewModel.updatedCount()
        binding.tvResult.text = count.toString()
    }
}
package com.aptron.mycoadingchallengewithconcept.dataBinding

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.aptron.mycoadingchallengewithconcept.R
import com.aptron.mycoadingchallengewithconcept.databinding.ActivityCoadingChallenge1Binding

class CoadingChallengeActivity1 : AppCompatActivity() {
    lateinit var binding: ActivityCoadingChallenge1Binding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_coading_challenge1)

        binding.progressBar.visibility = GONE;
        binding.button.setOnClickListener(View.OnClickListener {
            if (!binding.progressBar.isVisible) {
                binding.progressBar.visibility = View.VISIBLE
                binding.button.text = "STOP"
            } else {
                binding.progressBar.visibility = View.GONE
                binding.button.text = "START"
            }
        })
    }
}
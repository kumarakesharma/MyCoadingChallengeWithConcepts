package com.aptron.mycoadingchallengewithconcept.coroutinesConcept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.aptron.mycoadingchallengewithconcept.R
import com.aptron.mycoadingchallengewithconcept.databinding.ActivityCoroutineCodingChlng1Binding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CoroutineCodingChlng1 : AppCompatActivity(), View.OnClickListener {
    lateinit var binding : ActivityCoroutineCodingChlng1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoroutineCodingChlng1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCoroutineMain.setOnClickListener(this)
        binding.btnCoroutineIo.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.btn_coroutine_main ->{
                CoroutineScope(Dispatchers.Main).launch {
                    taskForMain()
                }
            }

            R.id.btn_coroutine_io ->{
                CoroutineScope(Dispatchers.IO).launch {
                    taskForIO()
                }
            }
        }
    }

    private fun taskForMain(){
        for (i in 1..10){
            Log.d("main", "$i in  ${Thread.currentThread().name}")
        }
    }

    private fun taskForIO(){
        for (i in 1..1000){
            Log.d("io", "$i in ${Thread.currentThread().name}")
        }
    }

}
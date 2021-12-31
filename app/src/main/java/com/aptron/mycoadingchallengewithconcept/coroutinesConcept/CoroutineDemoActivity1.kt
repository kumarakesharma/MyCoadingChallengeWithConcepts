package com.aptron.mycoadingchallengewithconcept.coroutinesConcept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.aptron.mycoadingchallengewithconcept.R
import com.aptron.mycoadingchallengewithconcept.databinding.ActivityCoroutineDemo1Binding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CoroutineDemoActivity1 : AppCompatActivity() {
    lateinit var binding : ActivityCoroutineDemo1Binding
    val _tag = CoroutineDemoActivity1::class.java.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoroutineDemo1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bntDownload.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                downloadUSereData()
            }
        }
    }

    fun downloadUSereData(){
        for (i in 1..200000){
            Log.d("MyTAg", "Downloading user $i in ${Thread.currentThread().name}");
        }
    }
}
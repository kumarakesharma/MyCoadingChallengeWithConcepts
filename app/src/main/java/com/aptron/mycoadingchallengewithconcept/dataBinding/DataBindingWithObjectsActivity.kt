package com.aptron.mycoadingchallengewithconcept.dataBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.aptron.mycoadingchallengewithconcept.R
import com.aptron.mycoadingchallengewithconcept.databinding.ActivityDataBindingWithObjectsBinding

class DataBindingWithObjectsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDataBindingWithObjectsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_with_objects)
        binding.student = getStudent()

    }

    private fun getStudent() : Student{
        return Student(1, "Andy Rubin", "andyRubin@gmail.com")
    }
}
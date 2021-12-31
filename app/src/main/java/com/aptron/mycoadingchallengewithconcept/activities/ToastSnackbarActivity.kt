package com.aptron.mycoadingchallengewithconcept.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast
import com.aptron.mycoadingchallengewithconcept.R
import com.aptron.mycoadingchallengewithconcept.R.*
import com.aptron.mycoadingchallengewithconcept.databinding.ActivityToastSnackbarBinding
import com.aptron.mycoadingchallengewithconcept.databinding.LayoutCustomToastBinding
import com.google.android.material.snackbar.Snackbar

class ToastSnackbarActivity : AppCompatActivity() {
    lateinit var binding : ActivityToastSnackbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToastSnackbarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClick.setOnClickListener(View.OnClickListener {
//            Snackbar.make(it, "Hello Sdnackbar", Snackbar.LENGTH_LONG).setAction("Ok", View.OnClickListener {
//
//            }).show()

//            Snackbar.make(it, "Hello Sdnackbar", Snackbar.LENGTH_LONG).show();

            showCustomToast("Hello learner")
        })
    }

    private fun showCustomToast(msg : String) {
        var binding = LayoutCustomToastBinding.inflate(layoutInflater)
        var toast = Toast(applicationContext)
        toast.duration = Toast.LENGTH_LONG
        toast.setGravity(Gravity.CENTER, 0, 0)
        binding.tvToastMsg.setText(msg)
        toast.view = binding.root
        toast.show()
    }

}
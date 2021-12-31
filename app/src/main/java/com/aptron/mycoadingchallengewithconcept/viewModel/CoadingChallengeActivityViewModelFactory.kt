package com.aptron.mycoadingchallengewithconcept.viewModel

import android.support.v4.app.INotificationSideChannel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class CoadingChallengeActivityViewModelFactory (private val startingTotal : Int): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CoadingChallengeActivity2Model::class.java)){
            return CoadingChallengeActivity2Model(startingTotal) as T
        }

        throw IllegalArgumentException("Unknown view model class")
    }
}
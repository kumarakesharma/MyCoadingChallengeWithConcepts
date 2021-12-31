package com.aptron.mycoadingchallengewithconcept.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ChallengeActivity2ViewmodelFactory(private var count : Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ChallengeActivityViewModel2::class.java)){
            return ChallengeActivityViewModel2(count) as T
        }
        throw IllegalArgumentException("Unknown view model class")
    }
}
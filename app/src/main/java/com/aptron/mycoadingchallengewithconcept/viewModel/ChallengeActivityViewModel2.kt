package com.aptron.mycoadingchallengewithconcept.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChallengeActivityViewModel2(count : Int) : ViewModel() {
    private var initialCount  = MutableLiveData<Int>()
    val totalCount : LiveData<Int>
    get() = initialCount

    init {
        initialCount.value = count
    }

    fun updatedCount() : Int {
        initialCount.value = initialCount.value?.plus(1)
        return initialCount.value!!
    }

}
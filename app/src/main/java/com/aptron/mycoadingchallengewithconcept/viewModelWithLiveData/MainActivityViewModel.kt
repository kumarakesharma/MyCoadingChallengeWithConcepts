package com.aptron.mycoadingchallengewithconcept.viewModelWithLiveData

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var initialCount  = MutableLiveData<Int>()
    val initialCountGloabal : LiveData<Int>
    get() = initialCount
    init {
        initialCount.value = 0
    }

    fun updatedCount() : Int {
        initialCount.value = initialCount.value?.plus(1)
        return initialCount.value!!
    }

}
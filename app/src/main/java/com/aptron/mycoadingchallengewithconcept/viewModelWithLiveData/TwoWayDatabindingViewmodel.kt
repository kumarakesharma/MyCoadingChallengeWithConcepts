package com.aptron.mycoadingchallengewithconcept.viewModelWithLiveData

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TwoWayDatabindingViewmodel : ViewModel() {
    val userName = MutableLiveData<String>()

    init {
        userName.value = "Rakesh"
    }


}
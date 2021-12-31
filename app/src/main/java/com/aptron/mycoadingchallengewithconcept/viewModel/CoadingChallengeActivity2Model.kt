package com.aptron.mycoadingchallengewithconcept.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// TODO : Viewmodel without ViewModelFactory concept
/*
class CoadingChallengeActivity2Model : ViewModel() {
    private var total : Int = 0;

    fun getCurrentCount() : Int{
        return total
    }

    fun updatedCount(input : Int) : Int{
        total = total + input
        return total
    }
}*/

// TODO : viewmodel with ViewMOdelFactory concept

/*class CoadingChallengeActivity2Model (startingTotal : Int): ViewModel() {
    private var total : Int = 0;

    init {
        total = startingTotal
    }

    fun getCurrentCount() : Int{
        return total
    }

    fun updatedCount(input : Int) : Int{
        total = total + input
        return total
    }
}*/

//TODO : ViewMOdel with LiveData
class CoadingChallengeActivity2Model (startingTotal : Int): ViewModel() {
//    var total = MutableLiveData<Int>();

    // make total variable as private
    private var total = MutableLiveData<Int>()
    val totalData : LiveData<Int>
    get() = total


    init {
        total.value = startingTotal
    }


    fun updatedCount(input : Int) {
        total.value = total.value?.plus(input)
    }
}

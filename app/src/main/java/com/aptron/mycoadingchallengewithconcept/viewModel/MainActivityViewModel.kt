package com.aptron.mycoadingchallengewithconcept.viewModel

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count = 0

    fun getCurrentCount() : Int{
        return count
    }

    fun getUpdatedCount() : Int{
        count = count!! + 1
        return count
    }
}
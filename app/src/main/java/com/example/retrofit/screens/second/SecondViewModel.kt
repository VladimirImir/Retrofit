package com.example.retrofit.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit.data.repository.Repository
import com.example.retrofit.model.beznal.Beznal
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel : ViewModel() {
    var repo = Repository()
    val myMoneyList: MutableLiveData<Response<Beznal>> = MutableLiveData()

    fun getBeznalMoney() {
        viewModelScope.launch {
            myMoneyList.value = repo.getBeznal()
        }
    }
}
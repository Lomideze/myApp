package com.example.myapplication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class BlankViewModel : ViewModel() {
    fun getService() {
        viewModelScope.launch {
            RetrofitClient.getItems().getService()
        }
    }
}
package net.madran.openlicenses.ui.cczero

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CczeroViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Burası CC Zero (CC0) Fragment'ı" // Başlangıç metni
    }
    val text: LiveData<String> = _text
}
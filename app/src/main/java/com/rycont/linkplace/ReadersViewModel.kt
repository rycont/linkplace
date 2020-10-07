package com.rycont.linkplace

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReadersViewModel : ViewModel() {
    private val _readers = MutableLiveData<ArrayList<Reader>>()
    val reader: LiveData<ArrayList<Reader>> = _readers

    init {
        val readerValue = reader.value
        if (readerValue !== null) {
            val mockCard = (
                    Reader(
                        "https://medium.com/@jsuch2362/viewmodel-%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C%EC%97%90%EC%84%9C-%EB%A9%80%EC%96%B4%EC%A7%80%EA%B8%B0-e9016d0416c",
                        "https://miro.medium.com/fit/c/96/96/1*UDwcfCr853vortz2-xTdYQ.jpeg",
                        "2020년 10월 6일",
                        "안드로이드에서 멀어지기: 1"
                    )
                    )
            readerValue.add(mockCard)
        }
    }

    fun addReader(readerToAdd: Reader) {
        val readerValue = reader.value
        if (readerValue === null) return
        readerValue.add(0, readerToAdd)
    }
}
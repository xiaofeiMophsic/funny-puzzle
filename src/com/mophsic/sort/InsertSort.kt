package com.mophsic.sort

import java.util.*

fun main() {
    val array: IntArray = intArrayOf(2, 6, 4, 3, 7, 8, 1, 2)
    insertSort(array)
    println(array.contentToString())
}

fun insertSort(array: IntArray) {
    if(array.size <= 1) {
        return
    }

    for (i in 1 until array.size) {
        val v = array[i]
        for (j in i - 1 downTo 0) {
            if (v < array[j]) {
                array[j+1] = array[j]
                array[j] = v
            }else{
                break
            }
        }
    }
}

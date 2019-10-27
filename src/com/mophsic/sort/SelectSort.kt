package com.mophsic.sort

fun main() {
    val array: IntArray = intArrayOf(2, 6, 4, 3, 7, 8, 1, 2, 0)
    selectSort(array)
    println(array.contentToString())
}

fun selectSort(array: IntArray) {
    if (array.size <= 1) {
        return
    }

    for (i in array.indices) {
        var minIndex = i
        for (j in i + 1 until array.size) {
            if (array[j] < array[minIndex]) {
                minIndex = j
            }
        }
        // change
        if (minIndex != i) {
            val h = array[i]
            array[i] = array[minIndex]
            array[minIndex] = h
        }
    }
}
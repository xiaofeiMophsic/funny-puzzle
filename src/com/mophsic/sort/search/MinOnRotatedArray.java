package com.mophsic.sort.search;

/**
 * @author xiaofei
 * @date 2016/12/29
 */
class MinOnRotatedArray {

    /**
     * 求旋转数组中的最小值，使用二分法提高查找效率
     * @param array 旋转数组
     * @return 最小值
     */
    int min(int[] array) {
        if (array == null || array.length <= 0)
            throw new IllegalArgumentException("The array length can not be 0!");
        int startIndex = 0;
        int minIndex = startIndex;
        int lastIndex = array.length - 1;

        while (array[startIndex] >= array[lastIndex]) {
            if (lastIndex - startIndex <= 1) {
                minIndex = lastIndex;
                break;
            }

            minIndex = (startIndex + lastIndex) / 2;
            if (array[startIndex] == array[minIndex] && array[startIndex] == array[lastIndex]){
                return minInOrder(array, startIndex, lastIndex);
            }
            
            if (array[minIndex] >= array[startIndex]) {
                startIndex = minIndex;
            } else if (array[minIndex] <= array[lastIndex]){
                lastIndex = minIndex;
            }
        }

        return array[minIndex];
    }

    private int minInOrder(int[] array, int idx1, int idx2) {
        int result = array[idx1];
        for (int i = idx1 + 1; i < idx2; i ++) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;
    }
}



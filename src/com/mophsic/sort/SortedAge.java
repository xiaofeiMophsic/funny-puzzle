package com.mophsic.sort;

/**
 * 对公司所有员工的年龄做排序
 * @author xiaofei
 * @date 2016/12/28
 */
final class SortedAge {

    void sortAge(int[] ages) {
        // 先定义一个数组用于存储所有年龄段的人的数量{0~99}
        int[] numOfAge = new int[100];
        for (int age : ages) {
            ++numOfAge[age];
        }

        // 开始排序
        int index = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < numOfAge[i]; j ++) {
                ages[index++] = i;
            }
        }
    }
}

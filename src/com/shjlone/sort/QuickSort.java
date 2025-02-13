package com.shjlone.sort;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            System.out.println(Arrays.toString(arr));
            // 分区操作，获取基准元素的最终位置
            int pivotIndex = partition(arr, low, high);
            // 递归地对基准元素左边的子数组进行快速排序
            quickSort(arr, low, pivotIndex - 1);
            // 递归地对基准元素右边的子数组进行快速排序
            quickSort(arr, pivotIndex + 1, high);
        }

    }

    private static int partition(int[] arr, int low, int high) {
        // 选择最后一个元素作为基准元素
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // 交换 arr[i] 和 arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // 交换 arr[i+1] 和 arr[high]（基准元素）
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0,5,2,1,6,3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)); // 输出: [1, 1, 2, 3, 6, 8, 10]
    }
}


package com.shjlone.sort;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // 将比 key 大的元素向后移动
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // 插入 key
            arr[j + 1] = key;
            System.out.println("第" + i + "轮排序结果: " + java.util.Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        System.out.println("排序前的数组:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        insertionSort(arr);

        System.out.println("\n排序后的数组:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

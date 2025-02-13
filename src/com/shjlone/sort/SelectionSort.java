package com.shjlone.sort;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // 假设当前位置的元素是最小的
            int minIndex = i;
            // 在未排序部分中找到最小元素的索引
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 将最小元素与未排序部分的第一个元素交换位置
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            System.out.println("第" + (i + 1) + "轮排序结果：" + java.util.Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 64, 25, 12, 22, 11};
        selectionSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");  // 输出: 11 12 22 25 64
        }
    }
}

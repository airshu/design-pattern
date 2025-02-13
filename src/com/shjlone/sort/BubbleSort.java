package com.shjlone.sort;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换 arr[j] 和 arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "轮排序结果: " + java.util.Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        System.out.println("排序前的数组:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        bubbleSort(arr);

        System.out.println("\n排序后的数组:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

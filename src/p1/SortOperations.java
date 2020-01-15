package p1;

import java.util.Arrays;

public interface SortOperations {
    public abstract void sortM1(int arr[]);

    public void sortM2(int arr[]);

    public void sortM3(int arr[]);

}

class mySort implements SortOperations {
    @Override
    public void sortM1(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");
    }

    @Override
    public void sortM2(int[] arr) {
        int temp, flag = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                flag = 1;
            }
            if (flag == 0) {
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");
    }

    @Override
    public void sortM3(int[] arr) {
        int temp, flag = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n");
    }

}
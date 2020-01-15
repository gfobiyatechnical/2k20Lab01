package DSA_Lab01;

import java.util.Scanner;

class Task2 {
    static int indexNum;
    private static int[] arr = new int[10];
    static int lengthOfArray = arr.length;

    public static void insertValuesIntoArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter " + lengthOfArray + " Integer type values -: ");
        for (indexNum = 0; indexNum < lengthOfArray; indexNum++) {
            arr[indexNum] = scanner.nextInt();
        }
    }

    public static void deleteElementOfArray() {
        int flag = 0;
        int valueFoundAtIndex;
        System.out.println("Enter Value You want To delete : ");
        Scanner scanner = new Scanner(System.in);
        int valueForDeleting = scanner.nextInt();
        for (int l = 0; l < lengthOfArray; l++) {
            if (valueForDeleting == arr[l]) {
                valueFoundAtIndex = l;
                for (int i = valueFoundAtIndex; i < lengthOfArray - 1 - l; i++) {
                    arr[i] = arr[i + 1];
                }
                lengthOfArray = -1;
            } else System.out.println("Value Which You Entered " + valueForDeleting + " is Not Present in the Array .");
        }
        System.out.println("\nOn deleting new array we get Array\n");
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("a[" + i + "] = " + arr[i]);
        }
    }


    public static void binarySearch(int arr[], int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                System.out.println(middleIndex);
            } else if (arr[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else if (arr[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
    }

    public static void sortingOfArray(int arr[]) {
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

}

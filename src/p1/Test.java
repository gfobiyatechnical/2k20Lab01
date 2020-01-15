package p1;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int arr[] = {12, 32, 123, 43};
        mySort myObj = new mySort();
        System.out.println("\t **  Enter For the Type of Sorting you want To Do  **\n\nPress 1 for Basic Sorting \nPreass 2 for Optimized-Bubble Sorting \nPress 2 for Simple-Bubble Sorting");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("You can Enter 1 or 2 or 3 .");
        }
        if (choice == 1) {
            myObj.sortM1(arr);
        } else if (choice == 2) {
            myObj.sortM2(arr);
        } else if (choice == 3) {
            myObj.sortM3(arr);
        }
    }
}

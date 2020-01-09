/*
@Author : Rakesh Yadav
 */
package DSA_Lab01;
import java.util.Scanner;

class Task1 {
    private int indexNum;
    private int array[] = new int[10];
    int lengthOfArray = array.length;

    /*
        public static void main(String[] args) {
            Task1 myObj = new Task1();
            myObj.insertValuesIntoArray();
        }
    */
    public void insertValuesIntoArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter " + lengthOfArray + " Integer type values -: ");
        for (indexNum = 0; indexNum < lengthOfArray; indexNum++) {
            array[indexNum] = scanner.nextInt();
        }
    }

    public void staticInitializationOfArray() {
        int staticArrayOfTenElements[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("StaticInitialized Array : ");
        for (int k = 0; k < 10; k++) {
            System.out.print("\t" + array[k]);
        }
    }

    public void displayInsertedArray() {
        System.out.print("\nInserted Array :");
        for (int m = 0; m < indexNum; m++) {
            System.out.print("\t" + array[m]);
        }
        System.out.println("");
    }

    public void sumOfArrayAndAverageOfElements() {
        double sum = 0.0, average = 0;
        for (int i = 0; i < lengthOfArray; i++) {
            sum = sum + array[i];
        }
        System.out.println("\n\nSum Of the Array : " + sum);
        average = sum / lengthOfArray;
        System.out.println("\nAverage of Array : " + average);

    }
}

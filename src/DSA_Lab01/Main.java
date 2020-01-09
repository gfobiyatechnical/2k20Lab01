/*
@Author : Rakesh Yadav
 */
package DSA_Lab01;

class Main {
    public static void main(String[] args) {
        Task1 myObj = new Task1();
        myObj.insertValuesIntoArray();
        myObj.displayInsertedArray();
        myObj.staticInitializationOfArray();
        myObj.sumOfArrayAndAverageOfElements();

        Task2 obj = new Task2();
        Task2.insertValuesIntoArray();
        Task2.deleteElementOfArray();
        Task2.binarySearch(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99}, 67);
        Task2.sortingOfArray(new int[]{89, 57, 91, 47, 95, 3, 27, 22, 67, 99});
    }
}

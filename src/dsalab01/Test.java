/*
@Author : Rakesh Yadav
 */
package dsalab01;

class Test {

    public static void main(String[] args) {
        // aggregation of Car & Person Class
        Car obj = new Car("xyz", "nano", "100");
        Person obj1 = new Person("Nobita", 18, 58);
        obj1.myintro();
        obj.carObj();
    }
}

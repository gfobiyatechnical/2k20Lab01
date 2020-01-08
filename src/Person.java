/*
@Author : Rakesh Yadav
 */
class Person {
    private String sName;
    private int sAge;
    private int sWeight;

    // Constructor ....
    Person(String sName, int sAge, int sWeight) {
        this.sName = sName;
        this.sAge = sAge;
        this.sWeight = sWeight;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public int getsWeight() {
        return sWeight;
    }

    public void setsWeight(int sWeight) {
        this.sWeight = sWeight;
    }

    // Getter & Setter ...
    public String getsName() {
        return sName;
    }


    public void myintro() {
        System.out.println("Name :" + sName + "\nAge : " + sAge + "\nWeight : " + sWeight);
    }
}

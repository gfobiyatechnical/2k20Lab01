class Car {
    private String type;
    private String make;
    private String price;

    // Constructor ..
    public Car(String type, String make, String price) {
        this.type = type;
        this.make = make;
        this.price = price;
    }

    // Getter & Setter ....
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void carObj() {
        System.out.println("Car Type : " + type + "\nCar Make : " + make + "\nCar Price : " + price);
    }

}

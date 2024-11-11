//import  com.deloitte.day1.Car;

//import packagename .classname  //Syntax

public class Car {


    //Atriubtes or properties
    String  colour;
    String model;
    int year;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String colour, String model, int year) {
        this.colour = colour;
        this.model = model;
        this.year = year;
    }

    //behaviour
    //Methods
    public void drive(){
        System.out.println("driving the car ");
    }
    public void display(){
        System.out.println("The " +colour+ " " +model+ " " +year+ " car");
    }

    public static void main(String[] args) {
        Car car=new Car("red","Hyndai", 2023);//Object creation

        Car car1 =new Car("white","Honda",2025); //object creation

        //Call the methods
        car.drive();
        car.display();


        car1.drive();
        car1.display();

    }
}

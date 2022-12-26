package importantJava;

public class CarManagement {
    public static void main(String[] args) {
        Garage garage = new Garage("menocorp");
        car car1 = new car("BMW");
        garage.pack(car1);
        car1.toBepack(garage);
    }
}

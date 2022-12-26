package importantJava;

public class Garage{
    String name;
    // int space ;
    // String location;

Garage(String name/*,int space,String location*/){
       this.name = name;
    // this.space = space;
    // this.location = location;
}
void pack(car car){
    System.out.println("The "+car.mark+" is in the garage");
}
}

package importantJava;

public class car{
    String mark;
   // String matricule;
   // String color;
   // double price;
car(String mark/*,String matricule,String color,double price*/){
    this.mark = mark;
   // this.matricule = matricule;
   // this.color = color;
   // this.price = price;
}
void toBepack(Garage garage){
    System.out.println(this.mark+" is to be packed in "+garage.name+" garage");
}
}

package importantJava;

public class Human {
    String name;
    int age;
    double height;
    Human(String name,int age,double height){
        this.name = name;
        this.age = age;
        this.height = height;

    }
    
    public void eat(){
        System.out.println(this.name+" is eating !");
    }
    public void drinks(){
        System.out.println(this.name+" is drinking !");
    }
}

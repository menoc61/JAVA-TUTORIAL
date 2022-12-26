// File name : Motocycle
class Motorcycle {
    String make;
    String color;
    boolean engineState;
        void startEngine() {
            if (engineState == true)
                System.out.println("The engine is already on.");
            else {
                engineState = true;
                System.out.println("The  engine is now on.");
            }
        }
        void showAtts() {
                System.out.println("This motorcycle is a "+ color +" "+ make);
            if (engineState == true){
                System.out.println("The engine is on.");
            }else{
                System.out.println("The engine is off.");
           }
        }
        public static void main (String args[]) {
                Motorcycle m = new Motorcycle();
                m.make = "Yamaha RZ350";
                m.color = "yellow";
                System.out.println("Calling showAtts...");
                m.showAtts();
                System.out.println("--------");
                System.out.println("Starting engine...");
                m.startEngine();
                System.out.println("--------");
                System.out.println("Calling showAtts...");
                m.showAtts();
                System.out.println("--------");
                System.out.println("Starting engine...");
                m.startEngine();
        }        
}

//======================== NOTE ==================================================================
// Pour les francophone desole encore une fois mais vous allez devoir utilise google translator🙇🏾‍♂️
// https://translate.google.com/
//=================================================================================================
// 1.) On this tutorial you will learn how to implement a basic java program
// 2.) This exercise has as goal to implement a classe Motorcycle where you are ask to display if the machine is on or OFF
// 3.) Also you are also expected to display all it's attribute through a single method
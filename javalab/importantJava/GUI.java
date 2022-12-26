package importantJava;
import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello "+name);
    
        int age = Integer.parseInt(JOptionPane.showInputDialog( "Enetr your age:"));
        JOptionPane.showMessageDialog(null, "you are "+age+" years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showInputDialog(null, "you have "+height+" cm tall");
    
    }
}

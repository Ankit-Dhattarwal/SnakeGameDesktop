import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SnakeGame extends JFrame {

    // create a construction
    SnakeGame(){
//        setLocation(700, 300);
        super("Snake Game"); // java k ander super first statememt hone chahiye [ imp ]
        add(new Board());
        pack(); // jab frame open tab b referce kar dega
       // setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(false);
//        setVisible(true);
    }

    public static void main(String[] args) {
        // create a object
        new SnakeGame(). setVisible(true);
    }
}
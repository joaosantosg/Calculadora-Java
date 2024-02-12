import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Calculator{

    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];

    JButton addButton,subButton,multiplyButton,divisionButton;
    JButton decimalButton, equalButton,deleteButton,clearButton;

    JPanel panel;

    // Font font = new Font("Ink Free");

    double num1,num2,result=0;

    char operator;



    Calculator() {
        frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(420,450);
        frame.setLayout(null);

        textfield = new JTextField();
        textfield.setBounds(50,25,300,50);
        textfield.setEditable(false);


        addButton = new JButton("+");
        subButton = new JButton("-");
        multiplyButton = new JButton("*");
        divisionButton = new JButton("/");
        decimalButton = new JButton(",");
        equalButton = new JButton("=");
        deleteButton = new JButton("Del");
        clearButton = new JButton("Clear");
        

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = multiplyButton;
        functionButtons[3] = divisionButton;
        functionButtons[4] = decimalButton;
        functionButtons[5] = deleteButton;
        functionButtons[6] = equalButton;
        functionButtons[7] = clearButton;


        for (int i = 0; i < 8; i++) {
            functionButtons[i] = addActionListener(this)
            // functionButtons[i] = addActionListener(this)

        }

        // textfield.setFont(font);

        frame.add(textfield);

        frame.setVisible(true);



    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
    }

    // @Override 
    // public void actionPerformed(ActivationEvent e){

    // }
}
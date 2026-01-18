package com.example;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rng = new Random();
        JOptionPane.showMessageDialog(null,"I will make up a number between 0 and 10. You will guess it.");
        int number = rng.nextInt(0,11);
        int answer;
        do {
            answer = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number."));

            if (answer >10 || answer < 0){
                JOptionPane.showMessageDialog(null,"Please enter a number between 0 and 10.");
            }
            else if (answer == number){
                JOptionPane.showMessageDialog(null,"Congrats. You won!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Wrong number. Try again.");
            }
        }while (answer != number);
    }
     }

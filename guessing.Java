package com.example;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rng = new Random();
        Scanner reader = new Scanner(System.in);
        System.out.println("I will make up a number between 0 and 10. You will guess it.");
        int number = rng.nextInt(0,11);
        int answer;
        do {
            System.out.println("Please enter the number.");
            answer = reader.nextInt();

            if (answer >10 || answer < 0){
                System.out.println("Please enter a number between 0 and 10.");
            }
            else if (answer == number){
                System.out.println("Correct number. You won!");
            }
            else{
                System.out.println("Wrong number, try again.");
            }
        }while (answer != number);
    }
     }

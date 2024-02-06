// Alexander Leang
// CS1400
// Assignment 4
// 10.10.2023


import java.util.Scanner;

public class LineChart {
    
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);

        int userAbility1, userAbility2, userAbility3, userAbility4, userAbility5;
        
        System.out.println("Enter ability 1 score: ");
        userAbility1 = keyboard.nextInt();

        System.out.println("Enter ability 2 score: ");
        userAbility2 = keyboard.nextInt();

        System.out.println("Enter ability 3 score: ");
        userAbility3 = keyboard.nextInt();
        
        System.out.println("Enter ability 4 score: ");
        userAbility4 = keyboard.nextInt();

        System.out.println("Enter ability 5 score: ");
        userAbility5 = keyboard.nextInt();

        
        System.out.print("\nAbility 1: ");
        for(int i = 1; i <= userAbility1 / 10; i++){
            System.out.print("-");
        }
        System.out.print("\nAbility 2: ");
        for(int i = 1; i <= userAbility2 / 10; i++){
            System.out.print("-");
        }
        System.out.print("\nAbility 3: ");
        for(int i = 1; i <= userAbility3 / 10; i++){
            System.out.print("-");
        }
        System.out.print("\nAbility 4: ");
        for(int i = 1; i <= userAbility4 / 10; i++){
            System.out.print("-");
        }
        System.out.print("\nAbility 5: ");
        for(int i = 1; i <= userAbility5 / 10; i++){
            System.out.print("-");
        }

        keyboard.close();
    }

}

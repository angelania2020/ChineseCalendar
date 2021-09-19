/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinesecalendar;

import java.util.Scanner;

/**
 *
 * @author Angelina
 */
public class ChineseCalendar {

    /**
     * @param args the command line arguments
     */
    static enum Color {
            GREEN, RED, YELLOW, WHITE, BLACK
        }
    
    static enum Animal {
            RAT, OX, TIGER, RABBIT, DRAGON, SNAKE, HORSE, GOAT, MONKEY, ROOSTER, DOG, PIG
        }
    
    public static void main(String[] args) {
        System.out.println("Enter the year: ");
        Scanner scanner = new Scanner(System.in);
        
        int year = 1984;
        int userYear = scanner.nextInt();
        int cycleNum=1;
        int cycleAdd=Math.floorDiv((userYear - year), 60);
        cycleNum+=cycleAdd;
        
        if (year > userYear) System.out.println("Please enter the year starting from 1984.");;
        
        while (cycleNum>=1){
        for (Color color : Color.values()) {
            if (year > userYear) break;
            for (Animal animal : Animal.values()){
                if (year < userYear) {
//                    System.out.printf("Year: %d, Color: %s, Animal: %s %n", year, color, animal);
                    year++;
                }
                else if (year == userYear) {
                    System.out.printf("Year: %d, Color: %s, Animal: %s %n", year++, color, animal);
                } 
            }
        }cycleNum--;
    }
}
}
import java.util.Scanner;

/**
 * Write a description of class Lab4TemperatureProblem here.
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 2/27/2025
 */

public class Lab4TemperatureProblem
{
    public static void main(String []args){
        int inputValue;
        double temperature;
        char unit;
        String temp;
        Scanner keyboard = new Scanner(System.in);
        
        do{
            System.out.println("Please input a whole number, a space, and C or F");
            inputValue = keyboard.nextInt();
            temp = keyboard.next();// if use nextLine();
            unit = temp.toUpperCase().charAt(0);// the String will be " (Space)Letter"(two char)
            while(!(unit == 'C' || unit == 'F'))//while(unit != 'C' && unit != 'F') also works
            {
                System.out.println("Please input 'F' or 'C'.");
                temp = keyboard.next();
                unit = temp.charAt(0);
            }
            if(unit == 'F'){
                temperature = (inputValue - 32) * 5 / 9;
                unit = 'C';
            }
            else{
                temperature = inputValue * 9 / 5 + 32;
                unit = 'F';
            }
            System.out.printf("%.1f %c.\n", temperature, unit);
            System.out.print("Enter yes to calculate another one.");
        }while(keyboard.next().equalsIgnoreCase("yes"));
    }
}
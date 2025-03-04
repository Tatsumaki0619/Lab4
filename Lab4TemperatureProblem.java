import java.util.Scanner;

/**
 * This program can convert and print out the temperature using a different unit(Fahr ot Cels)
 * based on the input temperature and the temperature units the user entered.
 * This program allows the user to restart and calculate mutiple temperatures if the user answers "yes".
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 2/27/2025
 */

public class Lab4TemperatureProblem
{
    public static void main(String []args){
        double inputValue, temperature;
        char unit;
        String temp;
        Scanner keyboard = new Scanner(System.in);
        
        do{
            System.out.println("Please input a whole number, a space, and C or F");
            inputValue = keyboard.nextDouble();
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
            System.out.print("Enter yes to calculate another one: ");
            
        }while(keyboard.next().equalsIgnoreCase("yes"));
    }
}
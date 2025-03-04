import java.util.Random;

/**
 * This program will generate three random integers(from 1 to 999)
 * The program will print them out and print certain number of "*"
 * representing each number's hundred's value. If the number is smaller than
 * 100. The program will print out" <100 no stars".
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 3/2/2025
 */
public class Lab4BarChartMethod
{
    public static void main(String []args)
    {
        int random1, random2, random3;
        random1 = randomNumber();
        random2 = randomNumber();
        random3 = randomNumber();
        System.out.println("Number 1 is: " + random1);
        System.out.println("Number 2 is: " + random2);
        System.out.println("Number 3 is: " + random3);
        System.out.println();
        printStars(random1);
        printStars(random2);
        printStars(random3);
    }

    /**
     * This is a method to generate random number and return it to main method.
     */
    public static int randomNumber()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        return randomNumber;
    }

    /**
     * This is a method that can print out "*" for the number's hundred's value.
     */
    public static void printStars(int input){
        if(input <= 100){
            System.out.println("The number is smaller than 100," 
                + "no stars printed ");
        }
        else{
            int temp = input % 100;
            int starNumber = (input - temp)/100;
            for(int i = 1; i <= starNumber; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
import java.util.Random;
/**
 * Write a description of class Lab4BarChart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab4BarChart
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
 * 
 */
    public static int randomNumber()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(999);
        return randomNumber;
    }
/**
 * 
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
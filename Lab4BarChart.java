import java.util.Random;

/**
 * Write a description of class Lab4BarChart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab4BarChart
{
    public static void main(String[] args){
        int first, second, third;
        Random generator = new Random();
        
        first = generator.nextInt(1000);
        second = generator.nextInt(1000);
        third = generator.nextInt(1000);
        System.out.println("The first number is " + first);
        System.out.println("The second number is " + second);
        System.out.println("The third number is " + third);
        System.out.println("");
        
        System.out.println("NUMBER BAR CHART");
        
        System.out.print("Number 1: ");
        printStars(first);
        System.out.print("Number 2: ");
        printStars(second);
        System.out.print("Number 3: ");
        printStars(third);
    }
    public static void printStars(int input){
        if(input < 100){
            System.out.println("< 100.");
        }
        else{
            for(int i = 1;i <= input / 100; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

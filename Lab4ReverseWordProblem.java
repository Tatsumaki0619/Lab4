import java.util.Scanner;

/**
 * Write a description of class Lab4ReverseWordProblem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Lab4ReverseWordProblem
{
    public static void main(String []args){
        String word, remaining, combined, flipped;
        char firstLetter;
        int length;
        Scanner keyboard = new Scanner(System.in);
        
        do{
            System.out.print("Please input a word or mutiple words");
            word = keyboard.next().toLowerCase();
            while(!(word.equals("quit"))){
                firstLetter = word.charAt(0);
                remaining = word.substring(1);
                combined = remaining + firstLetter;
                flipped = "";
                for(int i = combined.length() - 1 ; i >= 0; i--){
                    flipped += combined.charAt(i);
                }
                if(flipped.equals(word)){
                    System.out.printf("%s works.\n",word);
                }
                else{
                    System.out.printf("%s does not work.\n",word);
                }
                word = keyboard.next().toLowerCase();
            }
            System.out.print("input yes to start again.");
        }while(keyboard.next().equalsIgnoreCase("yes"));
    }
}

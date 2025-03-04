import javax.swing.JOptionPane;

/**
 * This program helps the user to count how many letters the user inputs
 * from the string the user provided. The user need to input a 
 * string(a sentence) and a letter. The program will tell the number
 * of the letter as an output(The system will ignore upper and lower case number of the inputs). 
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 2/27/2025
 */
public class Lab4Chall5
{
    public static void main(System[] args){
        String input, tempString, temp1Letter, stringLower;
        char letter, letterInput;
        int number, sum = 0;

        tempString = JOptionPane.showInputDialog("Please input a string: ");
        
        stringLower = tempString.toLowerCase();
        number = tempString.length();
        temp1Letter = JOptionPane.showInputDialog("Please input a letter: ");
        letterInput = temp1Letter.toLowerCase().charAt(0);

        for(int i = 1; i <= number; i++){
            letter = tempString.charAt(i-1);
            if(letter == letterInput){
                sum++;
            }
        }

        /* while
         * i = 1;
         * while(i <= number){
            letter = tempString.charAt(i-1);
            if(letter == letterInput){
                sum++;
                }
            i++;
            }*/
        
        String message = String.format("In the phrase: %s\n There are %d %c's.",stringLower, sum, letterInput);
        JOptionPane.showMessageDialog(null, message);
        System.exit(0);
    }
}

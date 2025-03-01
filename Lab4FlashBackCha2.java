import javax.swing.JOptionPane;

/**
 * Write a description of class Lab4FlashBackCha2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab4FlashBackCha2
{
    public static void main(String []args)
    {
        String temp;
        int maxLine;
        temp = JOptionPane.showInputDialog("Please input a number:");
        maxLine = Integer.parseInt(temp);
        if (maxLine % 2 == 0){
            maxLine += 1;
        }
        for(int i = 1; i <= maxLine; i += 2){
            for(int j = 1; j <= (maxLine - i)/2; j++){
                System.out.print(" ");
            }
            for(int j1 = 1; j1<= i; j1++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = maxLine - 2; i >= 1; i -=2){
            for(int j = 1; j <= (maxLine - i)/2; j++){
                System.out.print(" ");
            }
            for(int j1 = 1; j1 <= i; j1++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.exit(0);
    }
}

import javax.swing.JOptionPane;

/**
 * This program will first check the parity of user's input number(add one if it is an even number),
 * and then generate a diamond using "*".
 *
 * @author Qianyi Li
 * @version v1.0
 * @since 3/2/2025
 */
public class Lab4FlashBackCha2
{
    public static void main(String[] args)
    {
        String temp;
        int maxLine;
        temp = JOptionPane.showInputDialog("Please input a number:");
        maxLine = Integer.parseInt(temp);

        if (maxLine % 2 == 0){
            maxLine++;//maxLine += 1; also works
        }

        /*for(int i = 1; i <= maxLine; i += 2){
        for(int j = 1; j <= (maxLine - i)/2; j++){
        System.out.print(" ");
        }

        for(int j1 = 1; j1<= i; j1++){
        System.out.print("*");
        }

        System.out.println();
        }

        for(int i = maxLine - 2; i >= 1; i -= 2){
        for(int j = 1; j <= (maxLine - i)/2; j++){
        System.out.print(" ");
        }

        for(int j1 = 1; j1 <= i; j1++){
        System.out.print("*");
        }

        System.out.println();
        }
         */
        for(int line = 1, space = maxLine / 2; line <= maxLine/2 + 1; line++, space--){
            for(int i =1; i <= space; i++){
                System.out.print(" ");
            }
            for(int i =1; i<= line * 2 - 1; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int line = maxLine / 2, space = 1; line >= 1; line--, space++){
            for(int i =1; i <= space; i++){
                System.out.print(" ");
            }
            for(int i =1; i<= line*2-1; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.exit(0);
    }   
}
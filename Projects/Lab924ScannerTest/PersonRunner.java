
/**
 * Scanner tester
 *
 * @author (Justin Mills)
 * @version (924)
 */

import java.util.Scanner;
public class PersonRunner{

    public static void main(){
        Scanner kb = new Scanner(System.in);
        String inputStr = "";

        System.out.println("Enter a name or type \"quit\" to quit");
        inputStr = kb.nextLine();
        while(!inputStr.equals("quit")){
            
            Person per = new Person(inputStr);
            System.out.println(per.toString());
            System.out.println("Enter a name or type \"quit\" to quit");
            inputStr = kb.nextLine();
            
            
        }

    }
    
}


/**
 * Write a description of class Person here.
 *
 * @author (Justin Mills)
 * @version (9/24/19)
 */
public class Person extends ScannerTest
{
    // instance variables - replace the example below with your own
    public String fName, mName, lName;
    public int space;

    /**
     * Constructor for objects of class Person
     */
    public Person(String fullName)
    {
        parseName(fullName);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void  parseName(String fullName)
    {
        int space = fullName.indexOf(" ");
        int secondspace = fullName.lastIndexOf(" ");
        int comma = fullName.indexOf(",");
        if(!(secondspace == space)){
            fName = fullName.substring(0, space);
            lName = fullName.substring(secondspace+1, fullName.length());
            mName = fullName.substring(space+1, secondspace);
        }else{
            fName = fullName.substring(0, space);
            lName = fullName.substring(space+1, fullName.length());
            mName = "";
        }
        if(!(comma == -1)){
            lName = fullName.substring(0, comma);
            fName = fullName.substring(comma+1, fullName.length());
            mName = "";
        }else{
         lName = fullName.substring(0, comma);
         fName = fullName.substring(comma+2, secondspace);
         mName = fullName.substring(secondspace , fullName.length());
        }
    }
}

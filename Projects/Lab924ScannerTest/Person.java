
/**
 * Write a description of class Person here.
 *
 * @author (Justin Mills)
 * @version (9/24/19)
 */
public class Person extends ScannerTest
{
    // instance variables - replace the example below with your own
    public String fName, Mname, lName;

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
      fName = fullName.substring(0, fullName.indexOf(" "));
      lName = fullName.substring(fullName.length()-1, fullName.indexOf(" "));
      System.out.print(fName, lName);
    }
}

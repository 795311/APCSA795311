
/**
 * Write a description of class Student here.
 *
 * @author (Justin Mills)
 * @version (8/21)
 */
public class Student
{
    private String stuName;
    private int stuNumber;
    //constructor
    public Student(String name, int number)
    {
        stuName = name;
        stuNumber = number;
    }

    public String getName()
    {
        return stuName;
    }

    public int getNumber()
    {
        return stuNumber;

    }
}

public class Student
{
    private int myID;
    private String myName;

    public Student(String name, int id)
    {
        myName = name;
        myID = id;
    }

    public int getID()
    {
        return myID;
    }

    public String toString()
    {
        return myName + " " + myID;
    }

    public boolean equals(Object o)
    {
        Student other = (Student) o;
        return myID == other.myID;
    }
}

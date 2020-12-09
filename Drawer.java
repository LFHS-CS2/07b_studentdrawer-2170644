import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Drawer
{
    private int myMaxID;
    private ListNode myStudents;

    Drawer(int max)
    {
        myMaxID = max;
        myStudents = null;
    }

    public int getMaxID()
    {
        return myMaxID;
    }

    public void removeStudent(Student s)
    {

    }

    public void addStudent(Student s)
    {
        if (myStudents  == null){
            myStudents = new ListNode(s,null);
        }
        else {
            Student first = (Student) myStudents.getValue();
            if (s.getID() < first.getID()){
                myStudents = new ListNode(s,myStudents);
            }
            else {
                ListNode current = myStudents;
                ListNode after = current.getNext();
                while (after != null) {
                    Student s2 = (Student) after.getValue();
                    if (s.getID() < s2.getID()){
                        break;
                    }
                    else {
                        current = current.getNext();
                        after = current.getNext();
                    }
                }
                current.setNext(new ListNode(s,after));
            }
        }
    }

    public String toString()
    {
        String result="";
        ListNode current = myStudents;
        int count = 0;
        while (current != null){
            result += " " +current.getValue();
            current = current.getNext();
        }
        return "max = "+myMaxID+" size = " + count + " "+result;
    }

    public ListNode getFirst()
    {
        return myStudents;
    }
}

import java.util.*;

public class FilingCabinet
{
    private ListNode myDrawerList;

    public FilingCabinet()
    {
        myDrawerList = new ListNode(new Drawer(250),null);

        ListNode last = myDrawerList;

        last.setNext(new ListNode(new Drawer(428),null));
        last = last.getNext();

        last.setNext(new ListNode(new Drawer(637),null));
        last = last.getNext();

        last.setNext(new ListNode(new Drawer(750),null));
        last = last.getNext();

        last.setNext(new ListNode(new Drawer(999),null));
        last = last.getNext();

    }

    public Drawer findDrawer(int studentID)
    {
       
        return null;
    }

    public void addStudent(Student student)
    {
        Drawer d = findDrawer(student.getID());
        if (d != null){
            d.addStudent(student);
        }
    }

    public void removeStudent(Student student)
    {
        Drawer d = findDrawer(student.getID());
        d.removeStudent(student);
    }

    public String toString()
    {
        String ans = "";
        ListNode current= myDrawerList;
        int count = 0;
        while (current != null){
            ans += (count + ". " + current.getValue() + "\n");
            count++;
            current = current.getNext();
        }
        ans += ("-----") + "\n";
        return ans;
    }
}

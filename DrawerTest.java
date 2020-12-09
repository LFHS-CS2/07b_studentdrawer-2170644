import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

public class DrawerTest extends junit.framework.TestCase
{

    public static void main(String args[]) throws IOException {
        DrawerTest test = new DrawerTest();
        test.test_drawer();

    }
    @Test
    public void test_drawer()throws IOException {
        // Create a stream to hold the output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(ps);

        FilingCabinet fc = new FilingCabinet();
        Student adam = new Student("Adam", 123);
        Student ethan = new Student("Ethan", 178);
        System.out.println(fc);

        fc.addStudent(adam);
        System.out.println(fc);

        fc.addStudent(new Student("Alice", 542));
        System.out.println(fc);

        fc.addStudent(ethan);
        System.out.println(fc);

        fc.addStudent(new Student("Susan", 834));
        fc.addStudent(new Student("Jeff", 987));
        System.out.println(fc);

        fc.addStudent(new Student("Laura", 250));
        System.out.println(fc);

        fc.removeStudent(ethan);
        System.out.println(fc);
        fc.removeStudent(adam);
        System.out.println(fc);
        fc.removeStudent(new Student("Charles", 932));
        fc.removeStudent(adam);
        System.out.println(fc);


        // Put things back
        System.out.flush();
        System.setOut(old);
        // Show what happened
        System.out.println("Here: " + baos.toString());
        Scanner scan1 = new Scanner(new File("solution.txt"));
        Scanner scan2 = new Scanner(baos.toString());
        while (scan1.hasNext() && scan2.hasNext()) {
            assertEquals(scan1.next(), scan2.next());
        }
        assertTrue(!scan1.hasNext() && !scan2.hasNext());
    }
}

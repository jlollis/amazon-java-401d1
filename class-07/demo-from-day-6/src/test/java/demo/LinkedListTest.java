/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void testSomeLibraryMethod() {
        LinkedList linky = new LinkedList();
        assertTrue("add should return 'true'", linky.add("gingerbread cookie"));

        assertTrue("add should return 'true'", linky.add("candy cane"));

        System.out.println(linky.toString());
        System.out.println(linky.pop());
        System.out.println(linky.toString());

        System.out.println(linky.pop());
        System.out.println(linky.toString());
        System.out.println(linky.pop());
    }
}

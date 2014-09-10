import com.manusovich.q150.chapter1.Task1;
import com.manusovich.q150.chapter1.Task2;
import com.manusovich.q150.chapter1.Task3;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Tests for chapter1
 * <p>
 * Created by Alex Manusovich on 9/10/14.
 */
public class Chapter1 {
    @Test
    public void testTask1() {
        Assert.assertFalse(Task1.isAllUnique("ei9hr318r"));
        Assert.assertFalse(Task1.isAllUnique(""));
        Assert.assertFalse(Task1.isAllUnique("fwerf"));
        Assert.assertTrue(Task1.isAllUnique("bewc"));
        Assert.assertTrue(Task1.isAllUnique("3"));
        Assert.assertTrue(Task1.isAllUnique("9djoc74,wqaz"));
    }

    @Test
    public void testTask2() {
        Assert.assertEquals(Task2.reverse("ei9h"), "h9ie");
    }

    @Test
    public void testTask3() {
        Assert.assertEquals(Task3.removeDuplicates("ei9hr318r"), "ei9hr318");
        Assert.assertEquals(Task3.removeDuplicates(""), "");
        Assert.assertEquals(Task3.removeDuplicates("fwerf"), "fwer");
        Assert.assertEquals(Task3.removeDuplicates("bewc"), "bewc");
        Assert.assertEquals(Task3.removeDuplicates("3"), "3");
        Assert.assertEquals(Task3.removeDuplicates("9djoc74,wqaz"), "9djoc74,wqaz");
    }
}

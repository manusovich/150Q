import com.manusovich.q150.chapter1.Task1;
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
}

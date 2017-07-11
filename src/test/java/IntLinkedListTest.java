import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListTest {
    @Test
    public void testAppend() {
        IntLinkedList intLinkedList = new IntLinkedList();
        Assert.assertEquals(intLinkedList.size(), 0);
        intLinkedList.append(1);
        intLinkedList.append(2);
        Assert.assertEquals(intLinkedList.size(), 2);
    }
}

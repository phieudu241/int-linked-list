import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntLinkedListTest {
    IntLinkedList intLinkedList;

    @Before
    public void setUp() {
        intLinkedList = new IntLinkedList();
        Assert.assertEquals(intLinkedList.size(), 0);
        intLinkedList.append(1);
        intLinkedList.append(2);
        intLinkedList.append(3);
    }

    @Test
    public void testAppend() {
        Assert.assertEquals(intLinkedList.size(), 3);
    }

    @Test
    public void testRemoveTail() {
        intLinkedList.removeTail();
        Assert.assertEquals(intLinkedList.size(), 2);
    }

    @Test
    public void testRemoveAllIfGreater() {
        intLinkedList.removeAllIfGreater(1);
        Assert.assertEquals(intLinkedList.size(), 1);
    }
}

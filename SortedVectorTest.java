import junit.framework.TestCase;

import org.junit.Test;

public class SortedVectorTest extends TestCase  {
    @Test
    public void testAdd()  {
        SortedVector<Integer> instance = new SortedVector<Integer>();
        instance.add(5);
        instance.add(2);
        instance.add(1);
        instance.add(3);
        instance.add(10);
        instance.add(8);
        instance.add(6);

        instance.show();
    }

    @Test
    public void testRemove()  {
        SortedVector<Integer> instance = new SortedVector<Integer>();
        instance.add(5);
        instance.add(2);
        instance.add(1);
        instance.add(3);
        instance.add(4);


        instance.remove(2);
        instance.remove(0);
        instance.remove(-1);

        assertTrue(instance.get(0).equals(2));
        assertTrue(instance.get(2).equals(5));


    }

    @Test
    public void testGet() {
        SortedVector<Integer> instance = new SortedVector<Integer>();
        instance.add(5);
        instance.add(2);
        instance.add(1);
        instance.add(3);
        instance.add(4);
//
        assertTrue(instance.get(0).equals(1));
        assertTrue(instance.get(2).equals(3));
        assertNull(instance.get(-1));
        assertNull(instance.get(5));
        assertNull(instance.get(100));
    }

    @Test
    public void testIndexOf() {
        SortedVector<Integer> instance = new SortedVector<Integer>();
        instance.add(5);
        instance.add(2);
        instance.add(1);
        instance.add(3);
        instance.add(4);

        assertEquals(instance.indexOf(1), 0);
        assertEquals(instance.indexOf(5), 4);
        assertEquals(instance.indexOf(10), -1);

    }
}

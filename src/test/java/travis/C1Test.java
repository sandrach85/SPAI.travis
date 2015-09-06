package travis;

import static org.junit.Assert.*;

import org.junit.Test;

public class C1Test {

    @Test
    public void testGetValue() {
        C1 c1 = new C1(3);
        assertEquals(3, c1.getValue());
    }

}

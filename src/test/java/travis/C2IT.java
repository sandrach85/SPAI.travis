package travis;

import static org.junit.Assert.*;

import org.junit.Test;

public class C2IT {

    @Test
    public void testGetValue() {
        C2 c2 = new C2(3);
        assertEquals(3, c2.getValue());
    }

}

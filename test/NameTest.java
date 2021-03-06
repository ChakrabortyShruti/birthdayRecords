import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {
    @Test
    public void testShouldGiveFirstNameFirst() throws Exception {
        Name jack = new Name("Jack", "Joe");
        assertEquals("Jack Joe",jack.firstNameFirst());
    }

    @Test
    public void testShouldGiveLasttNameFirst() throws Exception {
        Name jack = new Name("Jack", "Joe");
        assertEquals("Joe,Jack",jack.firstNameLast());
    }
}

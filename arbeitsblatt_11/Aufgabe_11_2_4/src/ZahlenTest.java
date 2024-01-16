import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;

import static org.junit.jupiter.api.Assertions.*;
// import org.junit.Before;
// import org.junit.Test;

public class ZahlenTest {

    private Zahlen zahlenTest;

    @BeforeTest
    public void setUp() {
        zahlenTest = new Zahlen();
    }

    @Test
    public void lesser_diff_1() {
        assertEquals(1, zahlenTest.zahlen(1,2));
    }

    @Test
    public void lesser_diff_greater1() {
        assertEquals(15, zahlenTest.zahlen(1,6));
    }

    @Test
    public void equal() {
        assertEquals(0, zahlenTest.zahlen(1,1));
    }

    @Test
    public void greater_diff_1() {
        assertEquals(1, zahlenTest.zahlen(2,1));
    }

    @Test
    public void greater_diff_greater1() {
        assertEquals(15, zahlenTest.zahlen(6,1));
    }

}
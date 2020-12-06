import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test
    public void testValidTriangle() {
        float a = 3;
        float b = 4;
        float c = 2;

        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
        assertEquals(TriangleChecker.TriangleType.NORMAL, type);
    }

    @Test
    public void testEquilateralTriangle() {
        float a = 3;
        float b = 3;
        float c = 3;

        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);
    }

    @Test
    public void testIsoscelesTriangleCase1() {
        float a = 5;
        float b = 5;
        float c = 3;

        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }

    @Test
    public void testIsoscelesTriangleCase2() {
        float a = 3;
        float b = 5;
        float c = 5;

        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }

    @Test
    public void testIsoscelesTriangleCase3() {
        float a = 5;
        float b = 3;
        float c = 5;

        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }

    @Test
    public void testTooLongTriangleCase1() {
        float a = 1000;
        float b = 3;
        float c = 3;
        
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testTooLongTriangleCase2() {
        float a = 3;
        float b = 1000;
        float c = 3;
        
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testTooLongTriangleCase3() {
        float a = 3;
        float b = 3;
        float c = 1000;
        
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testNegativeLengths() {
        float a = 3;
        float b = 3;
        float c = -3;
        
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }
 
    @Test
    public void testZeroLength() {
        float a = 3;
        float b = 2;
        float c = 0;
        
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
        assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

}

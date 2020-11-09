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
    public void testIsoscelesTriangle() {
        float a = 5;
        float b = 5;
        float c = 3;

        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }

    @Test
    public void testTooLongTriangle() {
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

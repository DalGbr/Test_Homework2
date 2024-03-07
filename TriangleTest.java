import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    @DisplayName("Equilateral Triangle")
    public void test1(){
        Triangle myTriangle = new Triangle();
        assertEquals("Equilateral Triangle", myTriangle.checkTriangle(10, 10,10));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test2(){
        Triangle myTriangle = new Triangle();
        assertEquals("Isosceles Triangle", myTriangle.checkTriangle(10, 10,15));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test2_1(){
        Triangle myTriangle = new Triangle();
        assertEquals("Isosceles Triangle", myTriangle.checkTriangle(10, 15,10));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void test2_2(){
        Triangle myTriangle = new Triangle();
        assertEquals("Isosceles Triangle", myTriangle.checkTriangle(15, 10,10));
    }

    @Test
    @DisplayName("Scalene Triangle")
    public void test3(){
        Triangle myTriangle = new Triangle();
        assertEquals("Scalene Triangle", myTriangle.checkTriangle(10, 12,15));
    }

    @Test
    @DisplayName("Forbidden value")
    public void test4(){
        Triangle myTriangle = new Triangle();
        assertEquals("Value of a is not in the range of permitted values.", myTriangle.checkTriangle(0, 12,15));
    }

    @Test
    @DisplayName("Forbidden value")
    public void test5(){
        Triangle myTriangle = new Triangle();
        assertEquals("Value of b is not in the range of permitted values.", myTriangle.checkTriangle(12, 0,15));
    }

    @Test
    @DisplayName("Forbidden value")
    public void test6(){
        Triangle myTriangle = new Triangle();
        assertEquals("Value of c is not in the range of permitted values.", myTriangle.checkTriangle(15, 12,0));
    }

    @Test
    @DisplayName("Forbidden value")
    public void test7(){
        Triangle myTriangle = new Triangle();
        assertEquals("Value of a is not in the range of permitted values.", myTriangle.checkTriangle(300, 12,15));
    }

    @Test
    @DisplayName("Forbidden value")
    public void test8(){
        Triangle myTriangle = new Triangle();
        assertEquals("Value of b is not in the range of permitted values.", myTriangle.checkTriangle(12, 300,15));
    }

    @Test
    @DisplayName("Forbidden value")
    public void test9() {
        Triangle myTriangle = new Triangle();
        assertEquals("Value of c is not in the range of permitted values.", myTriangle.checkTriangle(15, 12, 300));
    }

    @Test
    @DisplayName("Not a triangle")
    public void test10() {
        Triangle myTriangle = new Triangle();
        assertEquals("Not a valid triangle.", myTriangle.checkTriangle(7, 2, 2));
    }

    @Test
    @DisplayName("Not a triangle")
    public void test11() {
        Triangle myTriangle = new Triangle();
        assertEquals("Not a valid triangle.", myTriangle.checkTriangle(2, 7, 2));
    }

    @Test
    @DisplayName("Not a triangle")
    public void test12() {
        Triangle myTriangle = new Triangle();
        assertEquals("Not a valid triangle.", myTriangle.checkTriangle(2, 2, 7));
    }
}
public class Triangle {
    public String checkTriangle(int a, int b, int c) {
        String result = "";

        if (!(a > 1 && a < 200)) {
            return "Value of a is not in the range of permitted values.";
        } else if (!(b > 1 && b < 200)) {
            return "Value of b is not in the range of permitted values.";
        } else if (!(c > 1 && c < 200)) {
            return "Value of c is not in the range of permitted values.";
        }

        if (!(a < b + c && b < a + c && c < a + b)) {
            return "Not a valid triangle.";
        }

        if ( a == b && b == c && c == a) {
            result = "Equilateral Triangle";
        } else if ( a == b || b == c || c == a) {
            result = "Isosceles Triangle";
        } else {
            result = "Scalene Triangle";
        }

        return result;
    }
}

import java.awt.*;

public class HelloWorld {
    private static nameParser parser = new nameParser();
    public static void main(String[] args) {
        String myName = parser.getName();
        System.out.println("hello, " + myName);
        Point originOne = new Point(23, 94);
        System.out.println("point: " + originOne.x + ", " + originOne.y);

        try{
            customeMath math = new customeMath();
            float result = math.divide(3, 0);
            System.out.println("divede result: " + result);
        }
        catch(ArithmeticException e){
            System.out.println("divede exception: " + e.getMessage());
        }
    }
}

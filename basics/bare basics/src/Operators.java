
public class Operators {
    @Override
    public String toString() {
        int a = 10;
        int b = 5;
        boolean x = true;
        boolean y = false;

        return "a + b = " + (a + b) + "\n" +
                "a - b = " + (a - b) + "\n" +
                "a * b = " + (a * b) + "\n" +
                "a / b = " + (a / b) + "\n" +
                "a % b = " + (a % b) + "\n" +
                "a > b: " + (a > b) + "\n" +
                "a == b: " + (a == b) + "\n" +
                "x && y: " + (x && y) + "\n" +
                "x || y: " + (x || y) + "\n" +
                "!x: " + (!x);
    }
}

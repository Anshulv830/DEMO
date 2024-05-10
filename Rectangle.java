public class Rectangle {

    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        int length = 5;
        int width = 3;
        int area = calculateArea(length, width);
        System.out.println("Area of the rectangle: " + area);
    }
}

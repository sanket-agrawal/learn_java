package Methods;

public class CircumferenceArea {

    public static void circumFerenceArea(int radius){
        System.out.println("Circumference of circle = "+(2 * Math.PI * radius));
        System.out.println("Area of circle = "+(Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        int radius = 25;
        circumFerenceArea(radius);
    }
}

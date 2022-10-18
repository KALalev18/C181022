class Area {
    public void computeArea(int a) {
        int area = a * a;
        System.out.println("Area of square: " + area);
    }
    public void computeArea(int a, int b) {
        int area = a * b;
        System.out.println("Area of rectangle: " + area);
    }
}
public class CalculateArea {
    public static void main(String[] args){
        Area ar = new Area();
        ar.computeArea(5);
        ar.computeArea(4, 2);
    }

}
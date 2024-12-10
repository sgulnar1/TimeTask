public class Rectangle implements Shape {
    private int weight;
    private int height;

    public Rectangle(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println(height * weight);
    }
}

package Bridge;

public class Main {
    public static void main(String[] args){
       Color green = new Green();
       Shape circle = new Circle(green);
       circle.applyColor();
        Color yellow = new Yellow();
        Shape cir = new Circle(yellow);
        cir.applyColor();
    }
}

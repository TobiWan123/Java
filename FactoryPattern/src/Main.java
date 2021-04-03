public class Main {
    public static void main(String[] args){
        // Create Shapes with Factory
        Shape rechteck = ShapeFactory.buildShape("Rectangle");
        Shape dreieck = ShapeFactory.buildShape("Triangle");
        Shape kreis = ShapeFactory.buildShape("Circle");

        rechteck.draw();
        dreieck.draw();
        kreis.draw();

        return;
    }
}

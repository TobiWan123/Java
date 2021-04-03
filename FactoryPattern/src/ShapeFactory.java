public class ShapeFactory {
    public static Shape buildShape(String type){
        switch (type){
            case "Rectangle": return new Rechteck();
            case "Triangle": return new Dreieck();
            case "Circle": return new Kreis();
            default: System.out.println("Wrong Input"); break;
        }
        return null;
    }
}

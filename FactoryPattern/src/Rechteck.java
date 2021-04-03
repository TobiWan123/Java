public class Rechteck implements Shape {
    float a,b ;

    public Rechteck(){
        this.a = (float) Math.random() * 100;
        this.b = (float) Math.random() * 100;
    }

    @Override
    public void draw() {
        System.out.println("Draw() Rechteck: a=" + this.a + ", b=" + this.b);
    }
}

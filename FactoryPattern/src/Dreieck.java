public class Dreieck implements Shape {
    float a,b,c ;

    public Dreieck(){
        this.a = (float) Math.random() * 50;
        this.b = (float) Math.random() * 50;
        this.c = (float) Math.random() * 50;
    }

    @Override
    public void draw() {
        System.out.println("Draw() Dreieck: a=" + this.a + ", b=" + this.b + ", c=" + this.c);
    }
}

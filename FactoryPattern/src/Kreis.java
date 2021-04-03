public class Kreis implements Shape {
    float r;
    double flaeche;

    public Kreis(){
        this.r = (float) Math.random() * 100;
        flaeche = Values.PI.value*Math.pow(this.r, 2);
    }
    @Override
    public void draw() {
        System.out.println("Draw Kreis: r=" + this.r + ", flaeche=" + this.flaeche);
    }
}

/**
 * Created by fatima on 02/10/16.
 */
public class Cercle {
    private double x;
    private double y;
    private double rayon;

    public Cercle (double a, double b, double r){
        this.x=a;
        this.y=b;
        this.rayon =r;
    }

    public double distance ( Cercle c1, Cercle c2){
        return (c1.rayon+c2.rayon);
    }

    public double distcentres (Cercle c1, Cercle c2){
        // TODO: complete this methode :)
        return();
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double getRayon(){
        return this.rayon;
    }

    public void setX(double val){
        this.x=val;
    }

    public void setY(double val){
        this.y=val;
    }

    public void setRayon(double val){
        this.rayon=val;
    }
}

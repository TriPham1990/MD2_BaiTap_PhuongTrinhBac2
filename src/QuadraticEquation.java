public class QuadraticEquation {
    private int a,b,c;
    public QuadraticEquation(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA(){
        return this.a;
    }

    public int getB(){
        return this.b;
    }

    public int getC(){
        return this.c;
    }

    public double getDiscriminant(){
        return Math.pow(this.b,2) - (4 * this.a * this.c);
    }

    public double getRoot(){
        return -this.b / (2 * this.a);
    }

    public double getRoot1(){
        return (-this.b + Math.sqrt(Math.pow(this.b,2) - 4 * this.a * this.c)) / (2 * this.a);
    }

    public double getRoot2(){
         return (-this.b - Math.sqrt(Math.pow(this.b,2) - 4 * this.a * this.c)) / (2 * this.a);
    }
}

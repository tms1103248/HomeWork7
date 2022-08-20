public class Triangle extends Figure {
    public int a =3;
    public int b=4;
    public int c=7;


    @Override
    public int getPerimetr() {
        return this.a +this.b+this.c;
    }

    @Override
    public int getSquare() {
        return (this.a*this.b)/2;
    }

    public static void main(String[] args) {
        Triangle triangle =new Triangle();
        System.out.println(triangle.getPerimetr());
        System.out.println((triangle.getSquare()));
    }
}

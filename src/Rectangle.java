public class Rectangle extends Figure{
    public int a =4;
    public int b=6;

    @Override
    public int getPerimetr() {
        return (this.a +this.b)*2;
    }

    @Override
    public int getSquare() {
        return this.a *this.b;
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle.getPerimetr());
        System.out.println(rectangle.getSquare());
    }
}

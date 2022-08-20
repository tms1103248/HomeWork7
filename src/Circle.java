public class Circle extends Figure{
    public int r=4;
    public int p =3;

    @Override
    public int getPerimetr() {
        return 2*this.p*this.r;
    }

    @Override
    public int getSquare() {
        return this.p*(this.r +this.r);
    }

    public static void main(String[] args) {
        Circle circle =new Circle();
        System.out.println(circle.getPerimetr());
        System.out.println(circle.getSquare());
    }
}

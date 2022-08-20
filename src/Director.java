public class Director implements Setable{

    public static void main(String[] args) {
        Director director = new Director();
director.print();
    }
   @Override
   public void print() {
   System.out.println("I am director");
   }
}

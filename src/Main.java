public class Main {
    public static void main(String[] args) {
        Figure[]arr=new Figure[3];
        arr[0]=new Triangle ();
        arr[1]=new Rectangle();
        arr[2]=new Circle();
        System.out.println(arr.length);
        for (int i=0; i< arr.length;i++) {
            System.out.println(arr[i].getPerimetr());
        }


        System.out.println(arr[0].getPerimetr()+ arr[1].getPerimetr()+arr[2].getPerimetr());



    }
}
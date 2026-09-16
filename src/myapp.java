public class myapp {

    // void method01() {
    // int a = 10;
    // int b = 20;

    // System.out.println(a + b);
    // }

    int add(int a, int b) {

        return a + b;
    }

    double add(int a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        myapp obj = new myapp();
        // obj.method01();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(30, 40.8, 50.9));
    }
}

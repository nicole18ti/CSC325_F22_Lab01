package edu.farmingdale.csc325_f22_lab01;

public class NewClass {

    private static void sayHello(String str) {
        System.out.println(str);

    }

    private static void sayHello(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }

    }

    public static void main(String[] args) {

        sayHello("Helllo World", 5);
    }
}

class Class2 {

    public Class2() {

    }

    public Class2(int x) {

    }

}

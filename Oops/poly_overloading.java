class math {
    int add (int a, int b) {
        return a + b;
    }
    int sub ( int a, int b, int c) {
        return a - b - c; 
    }
}
class math2 extends math {
    int mul (int a, int b, int c){
        return a * b * c;
    }
    int div (int a, int b) {
        return a / b;
    }
}
public class poly_overloading {
    public static void main (String args[]) {

        math m = new math();
        math2 m2 = new math2();

        System.out.println("Add operations:");
        System.out.println(m.add(5,10));

        System.out.println("Sub operations:");
        System.out.println(m.sub(2,5,6));

        System.out.println("Mul operations:");
        System.out.println(m2.mul(2, 3, 4));

        System.out.println("Div operations:");
        System.out.println(m2.div(10, 2));

    }
}

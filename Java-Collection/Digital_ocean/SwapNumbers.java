public class SwapNumbers {

public static void main(String[] args) {
int a = 10;
int b = 20;
int temp;

System.out.println("Before swapping of a is " + a + " and b is " + b);

temp = a;
a = b;
b = temp;

System.out.println("After swapping of a is " + a + " and b is " + b);
}

}
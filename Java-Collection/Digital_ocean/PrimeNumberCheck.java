public class PrimeNumberCheck {

 public static void main(String[] args) {
  System.out.println(Prime(19)); // true
  System.out.println(Prime(49)); // false
 }

 public static boolean Prime(int n) {
  if (n == 0 || n == 1) {
   return false;
  }
  if (n == 2) {
   return true;
  }
  for (int i = 2; i <= n / 2; i++) {
   if (n % i == 0) {
    return false;
   }
  }

  return true;
 }

}
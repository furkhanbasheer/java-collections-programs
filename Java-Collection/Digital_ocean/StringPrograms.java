public class StringPrograms {

 public static void main(String[] args) {
  String str = "Furkhan_The_Developer";

  System.out.println(reverse(str));
 }

 public static String reverse(String in) {
  if (in == null)
   throw new IllegalArgumentException("hey no msg no value ");

  StringBuilder out = new StringBuilder();

  char[] chars = in.toCharArray();

  for (int i = chars.length - 1; i >= 0; i--)
   out.append(chars[i]);

  return out.toString();
 }

}
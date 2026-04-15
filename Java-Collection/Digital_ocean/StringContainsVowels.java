public class StringContainsVowels {
    public static void main (String [] args) {
        System.out.println(Vowels("furkhan basheer"));
        System.out.println(Vowels("Ayz"));
    }
    public static boolean Vowels(String in) {
        return in.matches(".*[aeiou].*");
    }
}

import java.util.Scanner;

public class Assignment1p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vowels = 0, consonants = 0, digits = 0, special = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) digits++;
            else if ("aeiouAEIOU".indexOf(c) != -1) vowels++;
            else if (Character.isLetter(c)) consonants++;
            else special++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
    }
}


//Count Vowels and consonants from a word, Input: Dhaka, Output: Vowel: 2, Consonant: 3
public class CountVowelandConsonants {
    public static void main(String[] args) {
        String word = "Dhaka";
        int vowels = 0, consonants = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                    || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (Character.isAlphabetic(ch)) {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    }


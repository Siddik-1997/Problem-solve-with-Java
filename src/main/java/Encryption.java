// Encrypt word when A=F, Input: Apple, Output: Fuuqj
public class Encryption {
    public static void main(String[] args) {
        String word = "Apple";
        String s1 = "";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            switch (ch) {
                case 'A':
                    s1 = s1 + 'F';
                    break;
                case 'p':
                    s1 = s1 + 'u';
                    break;
                case 'l':
                    s1 = s1 + 'q';
                    break;
                case 'e':
                    s1 = s1 + 'j';
                    break;
                default:
                    s1 = s1 + ch;
                    break;
            }
        }
        System.out.println("Encrypted word: " + s1);
    }
    }

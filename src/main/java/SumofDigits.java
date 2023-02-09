// Find out sum of digits of a number, Input: 152, Output: 8
public class SumofDigits {
    public static void main(String[] args) {
        int num = 152;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of digits is: " + sum);
    }
}

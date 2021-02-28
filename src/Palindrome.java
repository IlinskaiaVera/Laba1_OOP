import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите слова: ");
        String s = in.nextLine();
        String[] string = s.split(" "); //разделение строки на подстроки
        String reverse_string = "";
        for (int r=0; r < string.length; r++) { //ревёрс каждого слова строки и внесение его в общую строку
            String word = string[r];
            reverse_string += reverseString(word) + " ";
        }
        String[] revers_string = reverse_string.split(" "); //разделение ревёрснутой строки на подстроки
        for (int n = 0; n<string.length; n++) {
            String reverse_word = revers_string[n];
            String normal_word = string[n];
            boolean result = isPalindrome(reverse_word, normal_word);
            System.out.print(result + " ");
        }
    }

    public static String reverseString(String word) {
            //метод для реверсии слов
            char[] array = word.toCharArray();
            String reverse_word = "";
            for (int n = array.length - 1; n >= 0; n--) {
                reverse_word = reverse_word + array[n];
            }
            return reverse_word;
    }

    public static boolean isPalindrome(String reverse_word, String normal_word) {
        boolean result;
        if (normal_word.equals(reverse_word)) {
            result = true;
            }
        else {
            result = false;
        }
        return result;
        }
    }

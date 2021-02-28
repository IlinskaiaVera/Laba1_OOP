public class Primes {
    public static void main(String[] args) {
        boolean answer; //переменная для true или false
        for (int n = 2; n < 101; n++) {
            answer = IsPrime(n); //проверка числа
            if (answer == true) { //вывод только простых чисел
                System.out.print(n + " ");
            }
        }
    }


    public static boolean IsPrime(int n) {
        //функция для определния простых чисел
        boolean end = true; //переменная для возвращения true или false
        for (int i = 2; i < n; i++) {
            if (n%i == 0) { /*если число делится не только на само себя,
                                       то оно не простое */
                end = false;
            }
        }
        return end;
    }
}
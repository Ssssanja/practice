import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cycles1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любое целое положительное число");
        long x = Long.parseLong(reader.readLine());
        reader.close();
        long result = 0;
        for (long i = 1L; i<=x; i++){
            result+=i;
        }
        System.out.println("Сумма всех чисел от 1 до введённого вами равна " + result);
    }
}

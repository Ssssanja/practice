package BasicsOfSoftwareCodeDevelopment.Formula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Formula4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите значение действительное число R, содержащее три числовых разряда в целой и дробной частях вида nnn.ddd");
        String r = reader.readLine();
        reader.close();
        System.out.println("Вы ввели число " + r);
        String[]razr = r.split("\\.");
        System.out.println("Результат выполнения: " + razr[1] + "." + razr[0]);
    }
}

package BasicsOfSoftwareCodeDevelopment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Formula1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите исходные числовые значения");
        System.out.println("Введите значение a:");
        String itIsA = reader.readLine();
        System.out.println("Вы ввели число " + itIsA + " в качестве значения a");
        System.out.println("Введите значение b:");
        String itIsB = reader.readLine();
        System.out.println("Вы ввели число " + itIsB + " в качестве значения b");
        System.out.println("Введите значение c:");
        String itIsC = reader.readLine();
        System.out.println("Вы ввели число " + itIsC + " в качестве значения c");
        reader.close();
        int a = Integer.parseInt(itIsA);
        int b = Integer.parseInt(itIsB);
        int c = Integer.parseInt(itIsC);
        System.out.println("Значение функции z составляет " + (((a-3)*b/2)+c));

    }
}

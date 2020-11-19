package BasicsOfSoftwareCodeDevelopment.Formula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Formula3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите исходные числовые значения");
        System.out.println("Введите значение x:");
        String itIsX = reader.readLine();
        System.out.println("Вы ввели число " + itIsX + " в качестве значения x");
        System.out.println("Введите значение y:");
        String itIsY = reader.readLine();
        System.out.println("Вы ввели число " + itIsY + " в качестве значения y");
        reader.close();
        double x = Double.parseDouble(itIsX);
        double y = Double.parseDouble(itIsY);
        System.out.println("Значение выражения по формуле составляет " + (((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*(Math.tan(x*y))));
        System.out.println(Math.sin(x) + " " + Math.cos(y) + " " + Math.cos(x) + " " + Math.sin(y) + " " + Math.tan(x*y));
    }
}

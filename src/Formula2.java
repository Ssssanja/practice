import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Formula2 {
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
        double a = Double.parseDouble(itIsA);
        double b = Double.parseDouble(itIsB);
        double c = Double.parseDouble(itIsC);
        System.out.println("Значение выражения по формуле составляет " + (((b+Math.sqrt((Math.pow(b,2)+4*a*c)))/(2*a))-(Math.pow(a,3)*c)+Math.pow(b,-2)));

    }
}

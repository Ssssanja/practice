package BasicsOfSoftwareCodeDevelopment.Cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cycles2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите а:");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("Введите b:");
        double b = Double.parseDouble(reader.readLine());
        System.out.println("Введите h:");
        double h = Double.parseDouble(reader.readLine());
        reader.close();
        double x;
        for (x=a;x<=b; x+=h){
            if (x>2){
                System.out.println("y = "+ x + ",  x = " + x);
            }
            else {
                System.out.println("y = "+ (-1*x) + ",  x = " + x);
            }
        }
    }
}

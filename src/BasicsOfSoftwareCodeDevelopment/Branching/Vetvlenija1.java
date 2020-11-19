package BasicsOfSoftwareCodeDevelopment.Branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vetvlenija1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите угол а:");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите угол b:");
        int b = Integer.parseInt(reader.readLine());
        reader.close();

        if ((a+b)>0 && (a+b)<180){
            System.out.println("треугольник существует");
            if ((a==90)||(b==90)||(a+b==90)){
                System.out.println("треугольник прямоугольный");
            }
            else {
                System.out.println("треугольник не прямоугольный");
            }
            System.out.println("Угол a = " + a);
            System.out.println("Угол b = " + b);
            System.out.println("Угол c = " + (180 - a - b));
        }
        else {
            System.out.println("треугольник не существует");
        }

    }
}

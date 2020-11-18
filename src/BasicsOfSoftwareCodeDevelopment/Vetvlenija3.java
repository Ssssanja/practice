package BasicsOfSoftwareCodeDevelopment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vetvlenija3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите координаты. x1, пожалуйста:");
        int x1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите координаты. y1, пожалуйста:");
        int y1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите координаты. x2, пожалуйста:");
        int x2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите координаты. y2, пожалуйста:");
        int y2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите координаты. x3, пожалуйста:");
        int x3 = Integer.parseInt(reader.readLine());
        System.out.println("Введите координаты. y3, пожалуйста:");
        int y3 = Integer.parseInt(reader.readLine());
        reader.close();
        if (((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))){
            System.out.println("Точки лежат на одной линии");
        }
        else {
            System.out.println("Точки не лежат на одной линии");
        }

    }
}

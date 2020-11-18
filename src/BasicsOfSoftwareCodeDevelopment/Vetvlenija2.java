package BasicsOfSoftwareCodeDevelopment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vetvlenija2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число a:");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите число b:");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введите число c:");
        int c = Integer.parseInt(reader.readLine());
        System.out.println("Введите число d:");
        int d = Integer.parseInt(reader.readLine());
        reader.close();
        int minAB = 0;
        int minCD = 0;
        if (a<=b){
            minAB=a;
        }
        else {minAB=b;}
        if (c<=d){
            minCD=c;
        }
        else {minCD=d;}
        if (minAB>=minCD){
            System.out.println("max = " + minAB);
        }
        else {System.out.println("max = " + minCD);}
    }
}

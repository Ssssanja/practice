package BasicsOfSoftwareCodeDevelopment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vetvlenija5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Х:");
        int x = Integer.parseInt(reader.readLine());
        if (x<=3){
            System.out.println(((x*x)-(3*x)+9));
        }
        else {
            System.out.println((1/(Math.pow(x,3)+6)));
        }
    }
}

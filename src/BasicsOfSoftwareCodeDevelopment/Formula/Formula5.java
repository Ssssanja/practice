package BasicsOfSoftwareCodeDevelopment.Formula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Formula5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите значение натурального числа Т:");
        String s = reader.readLine();
        int t = Integer.parseInt(s);
        reader.close();
        int sec = t%60;
        int hours = t/3600;
        int minS = (t - hours*3600)/60;
        System.out.println("Если число Т - это количество секунд, то вы ввели время: " + hours + " " + minS + " " + sec);
    }
}

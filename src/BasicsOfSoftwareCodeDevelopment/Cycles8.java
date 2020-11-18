package BasicsOfSoftwareCodeDevelopment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Cycles8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число А:");
        String a = reader.readLine();
        System.out.println("Введите число B:");
        String b = reader.readLine();
        reader.close();
        char[]charsFromA = a.toCharArray();
        char[]charsFromB = b.toCharArray();
        Set<Character> result = new HashSet<>();
        for (int i = 0; i<charsFromA.length;i++){
            for (int j = 0; j<charsFromB.length; j++){
                if (charsFromA[i]==charsFromB[j]){
                    result.add(charsFromA[i]);
                }
            }
        }
        if (result.isEmpty()){
            System.out.println("Совпадений нет");
        }
        else {
            System.out.print("Числа, входящие в написание и числа А и числа В:  ");
            for (char c:result){
                System.out.print(c + "  ");
            }
        }
    }
}

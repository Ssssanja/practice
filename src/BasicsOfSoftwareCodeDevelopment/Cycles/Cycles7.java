package BasicsOfSoftwareCodeDevelopment.Cycles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Cycles7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число m:");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Введите число n:");
        int n = Integer.parseInt(reader.readLine());
        reader.close();
        ArrayList<Integer>numbers = new ArrayList<>();
        if (m<n){
            for (int i = m; i<=n; i++){
                numbers.add(i);
            }
        }
        else if (n<m){
            for (int i = n; i<=m; i++){
                numbers.add(i);
            }
        }
        else {
            numbers.add(n);
        }
        for (int i = 0; i<numbers.size(); i++){
            System.out.print("Делители числа " + numbers.get(i) + ": ");
            for (int j = 2; j<numbers.get(i); j++){
                if (numbers.get(i)%j==0){
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

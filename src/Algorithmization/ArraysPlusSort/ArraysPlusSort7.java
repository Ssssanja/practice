package Algorithmization.ArraysPlusSort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysPlusSort7 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Введите длину последовательности a:");
            int n = Integer.parseInt(reader.readLine());
            System.out.println("Введите длину последовательности b:");
            int m = Integer.parseInt(reader.readLine());
            int[]a = makeRandSequenceArray(n);
            int[]b = makeRandSequenceArray(m);
            System.out.println("Имеется два массива:");
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static int[] makeRandSequenceArray (int length){
        int[]result = new int[length];
        int randLim = 100;
        for (int i = 0; i<result.length; i++){
            if (i==0) result[i] = (int) (Math.random() * randLim);
            else {
                if (result[i - 1] == randLim-1) {
                    randLim *= i;
                }
                int x = 0;
                while (x<result[i - 1]){
                    x = (int) (Math.random() * randLim);
                }
                result[i] = x;
            }
        }
        return result;
    }
}

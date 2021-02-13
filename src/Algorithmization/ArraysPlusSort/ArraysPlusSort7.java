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
            int before;
            int after;
            for (int j : b) {
                int x = findIndexToInsert(j, a);
                if (x == 0) {
                    System.out.printf("Число %d массива b нужно вставить " +
                            "перед началом массива а (перед числом %d массива а)\n", j, a[0]);
                } else if (x == n) {
                    System.out.printf("Число %d массива b нужно вставить " +
                            "после массива а (после числа %d массива а)\n", j, a[a.length - 1]);
                } else {
                    before = x - 1;
                    after = x;
                    System.out.printf("Число %d массива b нужно вставить " +
                            "между числами массива а %d и %d\n", j, a[before], a[after]);
                }
            }
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
    private static int findIndexToInsert(int x, int[]array){
        int result = 0;
        for (int i = 0; i<array.length;i++){
                if (x < array[i]) {
                    result = i;
                    break;
                }
                else {
                    for (int j = i;j<array.length;){
                        if (x>=array[j]){
                            j++;
                        }
                        if (j == array.length-i){
                            result = j-1;
                        }
                        else result=j;
                        break;
                    }
                }
        }
        return result;
    }
}

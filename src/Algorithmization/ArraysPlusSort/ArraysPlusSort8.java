package Algorithmization.ArraysPlusSort;

import Algorithmization.ArraysPlusSort.api.Fraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysPlusSort8 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите длину массива дробей:");
            int n = Integer.parseInt(reader.readLine());
            Fraction[] fractions = Fraction.getArrayRandomFractions(n);
            System.out.println("Имеется массив дробей: ");
            System.out.println(Arrays.toString(fractions));
            System.out.println("Общий знаменатель - " + Fraction.commonDenominator(fractions) + ", приводим к нему:");
            fractions = Fraction.makeToCommonDenominator(fractions);
            System.out.println(Arrays.toString(fractions));
            System.out.println("Сортируем: ");
            Fraction.sort(fractions);
            System.out.println(Arrays.toString(fractions));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

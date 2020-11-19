package Algorithmization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Arrays9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размерность массива N");        //запрос числа N
        int n = Integer.parseInt(reader.readLine());                //считывание
        reader.close();
        int [] array = new int[n];                                  //создание массива
        for (int i = 0; i<n; i++){
            array[i] = (int)(Math.random()*n - n/2);                //заполнение рандомными числами
        }
        HashMap<Integer,Integer>resultsOfCount = new HashMap<>();   //мапа для хранения результатов подсчёта повторов
        int maxCountOfMatches = 0;                                  //максимум повторов
        for (int i = 0; i<array.length; i++){
            int countOfMatches = 0;
            for (int j = 0; j< array.length; j++){                  //перебор массива с подсчётом повторов
                if (array[j]==array[i]){
                    countOfMatches++;
                }
            }
            resultsOfCount.put(array[i],countOfMatches);            //заполнение мапы результатами подсчёта
            if (countOfMatches>=maxCountOfMatches){
                maxCountOfMatches = countOfMatches;                 //обновление максимума повторов, если необходимо
            }
            countOfMatches = 0;
        }
        int min = 0;                                                //для хранения минимума из наиболее повторяемых
        for (Map.Entry<Integer, Integer> entry : resultsOfCount.entrySet()){
            if (entry.getValue()==maxCountOfMatches) {              //если наиболее повторяемое
               if(entry.getKey()<min){                              //если число из результатов меньше минимума, имеющегося на данный момент
                   min = entry.getKey();                            //обновить минимум
               }
            }
        }
        System.out.println("Число " + min);
    }
}

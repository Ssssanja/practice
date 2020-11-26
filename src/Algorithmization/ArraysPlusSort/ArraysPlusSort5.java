package Algorithmization.ArraysPlusSort;

public class ArraysPlusSort5 {
    public static void main(String[] args) {
        long m = System.currentTimeMillis();
        int[] array = new int[200000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 150000);                                      //заполнение рандомными числами
        }
//        System.out.println("Массив до сортировки: ");
//        for (int x : array) {                                                            //вывод на печать
//            System.out.print(x + " ");
//        }

        for (int i = 1; i < array.length; i++) {                                        //перебор массива для сортировки вставками
            int newElement = array[i];                                                  //рассматриваемый элемент
            int index = binarySearch(array,newElement, 0, i);                    //ищем куда переместить рассматриваемый элемент с помощь. бинарного поиска
            if (index < 0) {                                                            //если индекс <0
                index = -(index) - 1;                                                   //реверс знака и отнять единичку
            }
            System.arraycopy(array, index, array, index + 1, i - index); //сдвиг с помощью системного метода, он переносит сразу пачками, поэтому быстрее
            array[index] = newElement;                                                  //вставка
        }

//        System.out.println();
//        System.out.println("Массив до сортировки: ");
//        for (int x : array) {                                                            //вывод на печать
//            System.out.print(x + " ");
//        }
        System.out.println("Array was sorted. It took "+ ((double) (System.currentTimeMillis() - m))/1000 + " seconds");
    }


        public static int binarySearch ( int[] array, int keyToSearchPositionFor, int lowest, int highest){
            int low = lowest;                               //наименьший индекс для поиска
            int high = highest - 1;                         //наибольший

            while (low <= high) {                           //пока наименьший не достиг наибольшего
                int mid = (low + high) / 2;                 //средний индекс
                int midVal = array[mid];                    //среднее значение
                if (midVal < keyToSearchPositionFor)        //если среднее значение меньше искомого
                    low = mid + 1;                          //наименьший = средний + 1 (исключить левую часть)
                else if (midVal > keyToSearchPositionFor)   //иначе если среднее значение больше искомого
                    high = mid - 1;                         //наибольший = средний -1 (исключить правую часть)
                else                                        //иначе
                    return mid;                             //вернуть индекс искомого
            }
            return -(low + 1);                              //если нет искомого - вернуть -(наименьший+1)
        }
    }


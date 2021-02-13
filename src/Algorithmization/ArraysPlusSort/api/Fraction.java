package Algorithmization.ArraysPlusSort.api;

import java.util.Arrays;

public class Fraction implements Comparable<Fraction>{
    private int num;
    private int denom;


    public Fraction(int n, int d)
    {
        num    = n;
        denom  = d;
    }

    public Fraction(Fraction n, Fraction d)
    {
        num    = n.num * d.denom;
        denom  = n.denom * d.num;
    }

    public int getNum() {
        return num;
    }
    public int getDenom() {
        return denom;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void setDenom(int denom) {
        this.denom = denom;
    }

    public String toString()
    {
        return num + "/" + denom;
    }

    public static Fraction[] getArrayRandomFractions (int length){
        Fraction[]array = new Fraction[length];
        for (int i = 0; i<length; i++){
            array[i] = new Fraction((int)(Math.random() * 100 +1),(int)(Math.random() * 100 +1));
        }
        return array;
    }

    public static int commonDenominator(Fraction[] array){
        int[]denominators = new int[array.length];
        int maxDenom = 0;
        for (int i=0; i<array.length; i++){
            denominators[i] = array[i].getDenom();
            if (denominators[i]>maxDenom) maxDenom = denominators[i];
        }
        int result = Arrays.stream(denominators).reduce(1, (x, y) -> x * (y / gcd(x, y)));
        return result;
    }

    private static int gcd(int x, int y) {
        return (y == 0) ? x : gcd(y, x % y);
    }


    @Override
    public int compareTo(Fraction f) {
        return Integer.compare(this.num , f.num );
    }

    public static Fraction[] makeToCommonDenominator (Fraction[]array) {
        int comm = commonDenominator(array);
        Fraction[]result = new Fraction[array.length];
        for (int i = 0; i< array.length; i++){
            int num = array[i].getNum()*(comm/array[i].getDenom());
            result[i] = new Fraction(num, comm);
        }
        return result;
    }

    public static Fraction[] sort(Fraction[]array){
        Arrays.sort(array);
        return array;
    }
}

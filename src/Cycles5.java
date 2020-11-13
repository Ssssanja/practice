import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Cycles5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину числового ряда:");
        int length = Integer.parseInt(reader.readLine());
        System.out.println("Введите некоторое число");
        double someDigit = Double.parseDouble(reader.readLine());
        reader.close();
        ArrayList<Double>sequence = new ArrayList<>();
        for (int i = 1; i<=length;i++){
            sequence.add((1/(Math.pow(2,i))+(1/(Math.pow(3,i)))));
        }
        double result = 0;
        for (int i = 0; i<sequence.size(); i++){
            if (Math.abs(sequence.get(i))>=someDigit){
                result+=sequence.get(i);
            }
        }
        System.out.println(result);
    }
}

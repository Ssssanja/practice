import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Formula6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите координату Х:");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите координату Y:");
        int y = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        if (y>=0 && y<=4 && x>=-2 && x<=2){
            System.out.println("true");
        }
        else if (y>=-3 && y<=0 && x>=-4 && x<=4){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

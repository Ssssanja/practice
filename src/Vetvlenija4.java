import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vetvlenija4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размеры отверстия. А = ");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите размеры отверстия. B = ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введите размеры кирпича. X = ");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите размеры кирпича. Y = ");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("Введите размеры кирпича. Z = ");
        int z = Integer.parseInt(reader.readLine());
        reader.close();
        if (x<=a && (y<=b || z<=b)){
            System.out.println("Кирпич пройдёт через отверстие");
        }
        else if (y<=a && (x<=b || z<=b)){
            System.out.println("Кирпич пройдёт через отверстие");
        }
        else if (z<=a && (x<=b || y<=b)){
            System.out.println("Кирпич пройдёт через отверстие");
        }
        else {
            System.out.println("Кирпич не пройдёт через отверстие");
        }
    }
}

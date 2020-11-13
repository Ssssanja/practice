import java.nio.charset.Charset;

public class Cycles6 {
    public static void main(String[] args) {
        String s = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        char[] chars= s.toCharArray();
        for (int i = 0; i<chars.length;i++){
            System.out.println(chars[i] + " это " + (int)chars[i]);
        }
    }
}

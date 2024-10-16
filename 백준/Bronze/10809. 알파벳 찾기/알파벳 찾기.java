import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text = br.readLine().toCharArray();
        
        for (int i = 0; i < 26; i++) {
            int tmp = -1;
            for (int j = 0; j < text.length; j++) {
                if (text[j] - 'a' == i) {
                    tmp = j;
                    break;
                }
            }
            System.out.printf("%d ", tmp);
        }
    }
}
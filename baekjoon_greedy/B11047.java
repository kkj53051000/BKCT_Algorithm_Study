import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNK = reader.readLine().split(" ");
        int n = Integer.parseInt(inputNK[0]);
        int k = Integer.parseInt(inputNK[1]);

        int answer = 0;

        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] =  Integer.parseInt(reader.readLine());
        }

        for (int i = values.length-1; i >= 0; i--) {

            int value = k / values[i];

            if (value > 0) {
                answer += value;
                k = k - (values[i] * value);
            }
        }

        System.out.println(answer);

    }
}

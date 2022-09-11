import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        int sum = 0;

        StringTokenizer stMinus = new StringTokenizer(input, "-");


        // 첫번째 범위 sum에 더하기
        String firstRange = stMinus.nextToken();

        StringTokenizer firstRangeSt = new StringTokenizer(firstRange, "+");

        while (firstRangeSt.hasMoreTokens()) {
            int now = Integer.parseInt(firstRangeSt.nextToken());
            sum += now;
        }

        // 나머지 범위 sum에 빼기
        while (stMinus.hasMoreTokens()) {

            String nowRange = stMinus.nextToken();

            StringTokenizer stPlusSt = new StringTokenizer(nowRange, "+");

            while (stPlusSt.hasMoreTokens()) {
                int now = Integer.parseInt(stPlusSt.nextToken());
                sum -= now;
            }

        }

        System.out.println(sum);

    }
}

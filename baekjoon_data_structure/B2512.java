import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Size
        int size = Integer.parseInt(reader.readLine());

        // Array
        String arrStr = reader.readLine();
        String[] arrArray = arrStr.split(" ");

        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            arrList.add(Integer.parseInt(arrArray[i]));
        }

        Collections.sort(arrList);

        int maxValue = arrList.get(arrList.size()-1);

        // Max
        int m = Integer.parseInt(reader.readLine());

        int left = 0;
        int right = maxValue;

        int answerSum = 0;
        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int sum = 0;

            for (int i : arrList) {
                if (i >= mid) {
                    sum += mid;
                } else {
                    sum += i;
                }
            }

            if (sum < m) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            if (sum <= m && answerSum <= sum) {
                answerSum = sum;
                answer = mid;
            }
        }

        System.out.println(answer);

    }
}

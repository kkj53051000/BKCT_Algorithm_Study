import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] nkStrArray = reader.readLine().split(" ");
        int n = Integer.parseInt(nkStrArray[0]);
        int k = Integer.parseInt(nkStrArray[1]);

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(reader.readLine()));
        }

        long left = 0;
        long right = (arr.stream().mapToInt(Integer::intValue).sum() / n);

        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0;

            for (int i : arr) {
                sum += i/mid;
            }

            if (sum < k) {
                right = mid - 1;
            }else if (sum > k) {
                left = mid + 1;
            }else {
                if (answer < mid) {
                    answer = mid;
                }
                left++;
            }


        }

        System.out.println(answer);

    }
}

//4 11
//802
//743
//457
//539

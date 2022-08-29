import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch01 {
    public static void main(String[] args) throws IOException {
        int left = 1;
        int right = 1000;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.print("찾으려는 숫자를 입력해주세요 : ");

        int find = Integer.parseInt(reader.readLine());

        int cnt = 0;

        while (left <= right) {
            cnt++;
            int mid = (left + right) / 2;

            if (mid < find) {
                left = mid + 1;
            }else if (mid > find) {
                right = mid - 1;
            }else {
                break;
            }
        }

        System.out.println(cnt);
    }
}

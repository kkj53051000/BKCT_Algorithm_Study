import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[][] time = new int[n][2];


        for (int i = 0 ; i < n; i ++) {
            String[] se = reader.readLine().split(" ");
            time[i][0] = Integer.parseInt(se[0]);
            time[i][1] = Integer.parseInt(se[1]);
        }

        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }
        });

        int count = 1;
        int end = time[0][1];

        for (int j = 1; j < time.length; j++) {
            if (time[j][0] >= end) {
                count++;
                end = time[j][1];
            }
        }

        System.out.println(count);

    }
}

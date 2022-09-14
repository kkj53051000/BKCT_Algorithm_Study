import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        String distanceStr = reader.readLine();
        String priceStr = reader.readLine();

        String[] distanceStrList = distanceStr.split(" ");
        String[] priceStrList = priceStr.split(" ");

        long sum = 0;

        long nowPrice = Integer.parseInt(priceStrList[0]);

        for (int i = 0; i < n-1; i++) {

            long price = Integer.parseInt(priceStrList[i]);
            long distance = Integer.parseInt(distanceStrList[i]);

            if (price < nowPrice) {
                nowPrice = price;
            }
            sum += distance * nowPrice;
        }

        System.out.println(sum);
    }
}

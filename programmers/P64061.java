import java.util.ArrayList;
import java.util.List;

public class P64061 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        List<Integer> bucket = new ArrayList<>();

        int answer = 0;

        for (int m : moves) {
            for (int i = 0 ; i < board.length; i++) {
                int now = board[i][m-1];

                if (now != 0) {
                    System.out.println(bucket);
                    if (bucket.size() > 0 && bucket.get(bucket.size()-1) == now) {
                        board[i][m-1] = 0;
                        answer += 2;
                        bucket.remove(bucket.size()-1);
                    }else {
                        board[i][m-1] = 0;
                        bucket.add(now);
                    }
                    break;
                }
            }
        }

        System.out.println(answer);

    }
}

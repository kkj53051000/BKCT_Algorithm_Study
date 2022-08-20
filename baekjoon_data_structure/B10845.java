import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B10845 {

    private static List<Integer> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(reader.readLine());

        for (int i = 0; i < size; i++) {
            String input = reader.readLine();

            if (input.equals("pop")) {
                pop();
            }else if (input.equals("size")) {
                size();
            }else if (input.equals("empty")) {
                empty();
            }else if (input.equals("front")) {
                front();
            }else if (input.equals("back")) {
                back();
            }else { // push
                push(input);
            }

        }
    }

    public static void pop() {
        if (arr.size() == 0) {
            System.out.println(-1);
        }else {
            System.out.println(arr.get(0));
            arr.remove(0);
        }
    }

    public static void size() {
        System.out.println(arr.size());
    }

    public static void empty() {
        if (arr.size() == 0) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }

    public static void front() {
        if (arr.size() == 0) {
            System.out.println(-1);
        }else {
            System.out.println(arr.get(0));
        }
    }

    public static void back() {
        if (arr.size() == 0) {
            System.out.println(-1);
        }else {
            int lastIndex = arr.size()-1;
            System.out.println(arr.get(lastIndex));
        }
    }

    public static void push(String input) {
        String[] strArr = input.split(" ");
        int value = Integer.parseInt(strArr[1]);

        arr.add(value);
    }

}

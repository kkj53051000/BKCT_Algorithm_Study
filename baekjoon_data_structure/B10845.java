import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(reader.readLine());

        InputAndPrint2 inputAndPrint = new InputAndPrint2();

        for (int i = 0; i < size; i++) {
            String input = reader.readLine();

            inputAndPrint.decodeAndExecute(input);
        }
    }



}


class InputAndPrint2 {
    private List<Integer> queue = new ArrayList<>();

    public void decodeAndExecute(String input) {
        if (input.equals("pop")) {
            pop();
        } else if (input.equals("size")) {
            size();
        } else if (input.equals("empty")) {
            empty();
        } else if (input.equals("front")) {
            front();
        } else if (input.equals("back")) {
            back();
        } else { // push
            push(input);
        }
    }

    public void pop() {
        if (queue.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(queue.get(0));
            queue.remove(0);
        }
    }

    public void size() {
        System.out.println(queue.size());
    }

    public void empty() {
        if (queue.size() == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public void front() {
        if (queue.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(queue.get(0));
        }
    }

    public void back() {
        if (queue.size() == 0) {
            System.out.println(-1);
        } else {
            int lastIndex = queue.size() - 1;
            System.out.println(queue.get(lastIndex));
        }
    }

    public void push(String input) {
        String[] strArr = input.split(" ");
        int value = Integer.parseInt(strArr[1]);

        queue.add(value);
    }
}


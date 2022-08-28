import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(reader.readLine());

        InputAndPrint inputAndPrint = new InputAndPrint();

        for (int i = 0; i < size; i++) {
            String input = reader.readLine();

            inputAndPrint.decodeAndExecute(input);
        }
    }


}

class InputAndPrint {
    private List<Integer> stack = new ArrayList<>();

    public void decodeAndExecute(String input) {
        if (input.equals("pop")) {
            pop();
        }else if (input.equals("size")) {
            size();
        }else if (input.equals("empty")) {
            empty();
        }else if (input.equals("top")) {
            top();
        }else { // push
            push(input);
        }
    }

    public void pop() {
        if (stack.size() == 0) {
            System.out.println(-1);
        }else {
            int lastIndex = stack.size()-1;
            System.out.println(stack.get(lastIndex));
            stack.remove(lastIndex);
        }
    }

    public void size() {
        System.out.println(stack.size());
    }

    public void empty() {
        if (stack.size() == 0) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }

    public void top() {
        if (stack.size() == 0) {
            System.out.println(-1);
        }else {
            int lastIndex = stack.size()-1;
            System.out.println(stack.get(lastIndex));
        }
    }

    public void push(String input) {
        String[] strArr = input.split(" ");
        int value = Integer.parseInt(strArr[1]);

        stack.add(value);
    }
}
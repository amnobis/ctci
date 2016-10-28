package ch3;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author anobis
 */
public class Problem2 {
    Stack<Integer> data = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public void push(int val) {
        data.push(val);
        if (min.isEmpty()) {
            min.push(val);
        } else {
            if (val <= min()) {
                min.push(val);
            }
        }
    }

    public int pop() {
        int tmp = data.pop();
        if (tmp == min.peek()) {
            min.pop();
        }
        return tmp;
    }

    public int peek() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }
}

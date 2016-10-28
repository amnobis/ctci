package ch3;

/**
 * @author anobis
 */
public class Problem1 {
    private static final int numberOfStacks = 3;
    private final int max;
    private int[] threeStacks;
    private int[] curr;


    public Problem1(int n) {
        threeStacks = new int[n*numberOfStacks];
        curr = new int[numberOfStacks];
        max = n;
    }

    public boolean isFull(int stackNum) {
        return (curr[stackNum] == max);
    }

    public boolean isEmpty(int stackNum) {
        return (curr[stackNum] == 0);
    }

    public void push(int val, int stackNum) {
        if (!isFull(stackNum)) {
            threeStacks[top(stackNum)] = val;
            curr[stackNum]++;
        } else {
            throw new RuntimeException("Stack is full! Cannot push!");
        }
    }

    public int peek(int stackNum) {
        if (!isEmpty(stackNum)) {
            return threeStacks[top(stackNum)];
        }
        throw new RuntimeException("Cannot peek an empty stack!");
    }

    public int pop(int stackNum) {
        if (!isEmpty(stackNum)) {
            curr[stackNum]--;
            int tmp = threeStacks[top(stackNum)];
            threeStacks[top(stackNum)] = 0;
            return tmp;
        }
        throw new RuntimeException("Cannot pop an empty stack!");
    }

    private int top(int stackNum) {
        int offset = max * stackNum;
        int index = curr[stackNum];
        return index + offset;
    }
}

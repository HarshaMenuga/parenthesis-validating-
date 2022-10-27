package exam;

import java.util.Stack;

public class QNO2 {
	
public static void main(String[] args) {
    int arr[] = { 2, -1, -3, -7, -8, 9, 5, -5, -7,8,9,4,56,45 };

    Stack<Integer> pos = new Stack<>();
    Stack<Integer> neg = new Stack<>();

    int i;

    for (i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            pos.push(arr[i]);
        } else {
            neg.push(arr[i]);
        }
    }

    int tempArr[] = new int[arr.length];

    i = 0;

    int sizePos = pos.size();
    int sizeNeg = neg.size();

    while (i < tempArr.length) {
        if (sizePos > sizeNeg) {
            if (pos.size() > 0) {
                tempArr[i] = pos.pop();
            }
            if (neg.size() > 0) {
                tempArr[i + 1] = neg.pop();
                i++;
            }
        } else {
            if (neg.size() > 0) {
                tempArr[i] = neg.pop();
            }
            if (pos.size() > 0) {
                tempArr[i + 1] = pos.pop();
                i++;
            }
        }

        i++;
    }

    for (int no : tempArr) {
        System.out.print(no + " ");
    }
}
}
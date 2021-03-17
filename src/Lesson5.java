import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Lesson5 {
    public static void mergeIntervals(Interval[] arr){
        // sắp xếp lại mảng tăng dần theo thời gian bắt đầu
        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.getStart() - o2.getStart();
            }
        });

        Stack<Interval> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            //lấy giá trị trên cùng , không làm mất phânf tử đó
            Interval first = stack.peek();
            if(first.getEnd() < arr[i].getStart())
                stack.push(arr[i]);
            else if( first.getEnd() < arr[i].getEnd()){
                first.setEnd(arr[i].getEnd());
                stack.pop();
                stack.push(first);
            }

        }
        while (!stack.isEmpty()){
            Interval top = stack.pop();
            System.out.println(top.toString());
        }
    }
    public static void main(String[] args) {
        Interval[] arr = new Interval[4];
        arr[0] = new Interval(1,3);
        arr[1] = new Interval(5,10);
        arr[2] = new Interval(2,6);
        arr[3] = new Interval(15,18);
        mergeIntervals(arr);

    }
}

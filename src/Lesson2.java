import java.util.Objects;

public class Lesson2 {
    public static int checkIndex(int[] arr, int n){
        boolean tmp = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n)
                return i;
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7};
        int n = 8;

        for (int i = 0; i < checkIndex(arr, n); i++) {
            for (int j = i+1; j < checkIndex(arr, n) ; j++) {
                if(arr[i] + arr[j] == n)
                    System.out.println("["+i+","+j+"]");
            }
        }

    }
}

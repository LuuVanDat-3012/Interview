public class Lesson3 {
    public static void main(String[] args) {
        int[] arr = {-2};
        int max = arr[0];
        int sum =0;
        int first = 0, last = 0;

        for (int i = 0; i < arr.length  ; i++) {
            for (int j = i; j < arr.length ; j++) {
                sum = tong(arr, i, j);
                if (sum > max){
                    max = sum;
                    first = i;
                    last = j;
                }
            }
        }

        for (int i = first; i <= last ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSum = "+ max);
    }
    public static int tong(int[] arr, int f, int l){
        int tmp=0;
        for (int i = f; i <= l; i++) {
            tmp += arr[i];
        }
        return tmp;
    }
}

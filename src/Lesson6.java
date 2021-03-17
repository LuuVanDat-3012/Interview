public class Lesson6 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,4};
        int max = 0;
        int tmp;
        int sum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]<arr[j])
                    sum=arr[i]*(j-i);
                else
                    sum=arr[j]*(j-i);
                if(sum>max)
                    max=sum;
            }
        }
        System.out.println("Output : "+max);
    }
}

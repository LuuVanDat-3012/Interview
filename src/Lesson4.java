import java.util.Scanner;

public class Lesson4 {
    public static int bac(int n){
        if(n == 1) return 1;
        if (n == 2 ) return 2;
        return bac(n-2)+ bac(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Input : ");
            n = Integer.parseInt(sc.nextLine());
        } while (n < 0 || n > 45);
        System.out.println("Output : "+ bac(n));
    }
}

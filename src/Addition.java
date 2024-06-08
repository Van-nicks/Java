import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("First No.: ");
        int a=sc.nextInt();
        System.out.print("Second No.: ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum = "+c);
    }
}

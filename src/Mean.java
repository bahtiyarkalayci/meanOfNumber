import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        int num,i=1,sum=0,imp=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        num=scanner.nextInt();
        while ( i<=num){
            if (i%3==0){
                System.out.println("3 e bölünen sayı"+i);
                imp++;
                sum+=i;

            } else if (i%4==0) {
                System.out.println("4 e bölünen sayı"+i);
                imp++;
                sum+=i;

            }
            i++;


        }
        double mean=sum/imp;
        System.out.println("mean="+mean);
    }
}

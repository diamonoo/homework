package hw.lesson2;
import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {
        int month ;
        for (int q=1;q<=12;q++) {
            month=   Math.round((q%12)/3 ) ;
            switch ( month  ) {
                case 0:
                    System.out.println("win");
                    break;
                case 1:
                    System.out.println("spr");
                    break;
                case 2:
                    System.out.println("sum");
                    break;
                case 3:
                    System.out.println("aut");
            }
        }

        System.out.println("    ");
        for (int q=1;q<=12;q++){
            month=   Math.round((q%12)/3 ) ;

            if (  month==0 )
                System.out.println("win");
            else if ( month==1)
                System.out.println("spr");
            else if ( month==2)
                System.out.println("sum");
            else if ( month==3)
                System.out.println("aut");
        }


        int num=9;
        if(num%2==0) System.out.println("chetnoe");
        else  System.out.println("nechetnoe");



        if(num>-5) System.out.println("teplo");
        else if (num>-20) System.out.println("norm");
        else System.out.println("holod");



        String s[] = {"кр", "ор", "жел", "зел", "гол", "син", "фиол" };
        if(num>0&&num<8) System.out.println(s[num-1]);
        else System.out.println("error");


        for (int q=1;q<=99;q++) {
            if (q % 2 == 1) System.out.println(q);
        }


        for (int q=5;q>=1;q--) {
            System.out.println(q);
        }


        Scanner scanner = new Scanner(System.in);
        num=scanner.nextInt();
        int sum=0;
        if( num>0) {
            sum=(int)(1+num)*num/2;
            System.out.println(sum);
        }
        else System.out.println("wrong input");

        num=1;
        while (num <= 14) {
            System.out.println(num*7);
            num++;
        }


        num=1;
        for (int q=0;q<=9;q++) {
            System.out.println(-5*q);
        }

        num=1;
        for (int q=10;q<=20;q++) {
            System.out.println(q*q);
        }



        num=11;
        for (int tmp,fib1=0, fib2=1,  q=1;q<=num;q++) {
            System.out.println(fib1);
            tmp=fib1;
            fib1= fib2;
            fib2=tmp+fib1;
        }

        float vklad=5600, percent=7, result=vklad;
        month = 14;
        for (int q=1;q<=month;q++) {
            result=result+ vklad*( percent/100);
        }
        System.out.println(result);



        for (int i=2;i<=9;i++) {
            for (int j=2;j<=9;j++) {
                System.out.println(i +"  "+j+" = "+ (i*j));
            }
        }


    }
}

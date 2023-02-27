package hw.lesson3;
import java.util.Scanner;
class Homework3 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("input arr length...");
    int[] arr = new int[scanner.nextInt()];
        for (int i = 0; i < arr.length; i++) {
                arr[i]  = (int) (Math.random() * 100  );
            System.out.print( arr[i] +"  ");
        }


    int  number;
        boolean q=true;
        do {
            System.out.println("\n1-find\n2-delete\n3-min,max,av\n4-exit");
                switch (scanner.nextInt() ){
                        case 3 :
                            double avm = 0 ;
                            int min=arr[0], max=arr[0] ;
                            for (int j : arr) {
                                if (j < min) {
                                    min = j;
                                }
                                if (j > max) {
                                    max = j;
                                }
                                avm += j;
                            }
                            System.out.println(" avm= " + avm/arr.length + " max= " + max+ " min= " + min);
                            break;

                        case 1 :
                            System.out.println("input number...");
                            number=scanner.nextInt();
                                for (int i = 0; i < arr.length; i++){
                                        if (arr[i]==number){
                                            System.out.println("vhodit");
                                            break;
                                        }
                                        else if(i==arr.length-1) System.out.println("ne vhodit");
                                }
                                break;
                        case 2 :
                            System.out.println("input number...");
                            number=scanner.nextInt();
                            int isFound=0, arr2[] = new int[arr.length-1];
                            for (int i = 0; i < arr.length; i++){
                                    if (arr[i]==number){
                                        isFound=i;
                                        break;
                                    }
                            }
                            if (isFound!=0){
                                        for (int i = 0; i < arr.length; i++){
                                            if (i<isFound){
                                                arr2[i]=arr[i];
                                            }
                                            if (i>isFound){
                                                arr2[i-1]=arr[i];
                                            }
                                        }
					arr=arr2;
                            } else System.out.println("ne vhodit");
                            
                            for (int j:arr2 ){
                                System.out.print(j +"  ");
                            }
                                break;

                        case 4 :
                            q= false;
                            break;
                        default:
                                System.out.println("wrong input");
                }
        } while (q);
        scanner.close();
}
}
import java.util.Scanner;

public class NumberOccurrence {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int range = sc.nextInt();
        
        }
        int tar = sc.nextInt();
        for(int i= 0;i<n;i++ ){
            if(tar == range){
                System.out.print(i+1 +" ");
            }
        }

    }

}

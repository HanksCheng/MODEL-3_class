import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        float data[]=new float[n];
        for (int i=0;i<data.length;i++){
            data[i]=scn.nextFloat();
        }
        int l=scn.nextInt();
        for (int i=0;i<data.length;i++){
            if (data[i]>=l){
                System.out.println(data[i]);
            }
        }
    }
}

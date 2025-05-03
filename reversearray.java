import java.util.Scanner;
public class reversearray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ofthe array");
        int size  = sc.nextInt();
        int [] array = new int[size];
        for(int i =0;i<size;i++){
            array[i] = sc.nextInt();
        }
        for(int i=size-1;i>=0;i--){
            System.out.println(array[i]);
        }
        sc.close();
    }
}
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int number = scan.nextInt();
        int[] array = new int[number];
        
        
        for(int i = 0; i < number; i++){
            array[i] = scan.nextInt();
        }
        
        int sum = 0;
        for(int numbers : array){
            sum += numbers;
        }
        System.out.print(sum);
    }
}

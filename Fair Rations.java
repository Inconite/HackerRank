
import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int b[] = new int[N];
        int sum = 0;
        for(int i = 0; i < N; i++){
            b[i] = sc.nextInt();
            sum += b[i];
        }
        if(sum % 2 != 0) {
            System.out.println("NO");
        }
        else{
            int count = 0;
            for(int i = 0; i < N; i++){
                if(b[i] % 2 != 0) {
                    b[i] += 1;
                    b[i+1] += 1;
                    count += 2;
                }
            }
            System.out.println(count);
        }
    }
}

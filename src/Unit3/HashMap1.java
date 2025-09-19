package Unit3;
import java.util.HashMap;
import java.util.Scanner;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> h = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String key = sc.next();
            int val  = sc.nextInt();
            h.put(key,val);
        }
        for(String str:h.keySet()){
            System.out.print(h.get(str)+" ");
        }
    }
}

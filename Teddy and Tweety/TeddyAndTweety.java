/*Teddy has N chocolates. Tweety asks him to give few chocolates to her. Teddy is very generous and kind hearted. So he decides to give all chocolates to Tweety, but only on one condition.

If integer N can be divided into 3 parts, such that these three parts can form sides of an equilateral triangle, then Teddy gives all chocolates to Tweety. Otherwise he won't give any chocolate to her.

Print "YES" (without quotes) if Teddy will give all chocolates to Tweety. Otherwise print "NO" (without quotes).*/
import java.util.*;
class TeddyAndTweety {
    public static void main(String args[] ) throws Exception {
        Scanner S=new Scanner(System.in);
        int N=S.nextInt();
        if(N%3==0)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}

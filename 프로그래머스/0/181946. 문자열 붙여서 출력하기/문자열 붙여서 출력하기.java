import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        String str = a.replace(" ", "");
        String str2 = b.replace(" ", "");
        
        System.out.print(str);
        System.out.print(str2);
    }
}
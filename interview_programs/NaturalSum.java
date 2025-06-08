package DSA;

import java.util.*;


class NaturalSum{
    public static void main(String args[]){
    	System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = naturalSum(n);
        System.out.println(res);
    }

    static long naturalSum(int n){
        return (n*(n+1))/2;

}
}

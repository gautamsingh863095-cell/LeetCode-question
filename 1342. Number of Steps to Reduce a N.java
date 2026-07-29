//1342. Number of Steps to Reduce a Number to Zero
import java.util.*;
class Solution {

    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
        int count=0;
      while(num>0){
        if(num%2==0){
            num=num/2;
        } else {
            num=num-1;
        }
        count++;
      }  
      System.out.println(count);
    }
}
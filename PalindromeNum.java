import java.util.*;
class PalindromeNum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any positive integer: ");
int n=sc.nextInt();
int rd=0;
int num=n;
while(n>0){
rd=rd*10+(n%10);
n=n/10;
}
if(num==rd)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}
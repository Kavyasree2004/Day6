import java.util.*;
class Productdigit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int pd=1;
System.out.print("Enter any positive integer: ");
int n=sc.nextInt();
while(n>0){
pd=pd*(n%10);
n=n/10;
}
System.out.println(pd);
}
}

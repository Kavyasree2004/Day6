import java.util.*;
class ContinueEx{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(); //5
byte i=0;
while(true){
i++;
if(i%5==0)
continue;
System.out.print(i+",");
}
}
}
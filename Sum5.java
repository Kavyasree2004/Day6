class Sum5{
public static void main(String args[]){
int i=1;
int sum=0;
while(i<=100)
{
System.out.print(i+"+");
sum=sum+i;
i+=5;
}
System.out.println("\b"+"="+sum);
}
}
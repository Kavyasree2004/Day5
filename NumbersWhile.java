import java.util.*;
class NumbersWhile{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=n;
while(i>=0){
i-=5;
System.out.print(i+" ");
}
}
}
import java.util.*;
class InputSwap2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n1,n2;
n1=sc.nextInt();
n2=sc.nextInt();
n1=n1+n2;
n2=n1-n2;
n1=n1-n2;
System.out.println(n1+"\n"+n2);
}
}
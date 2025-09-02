class Fibonacciseries
{ 
public static void main(String[] args)
{ 
int num=8,first=0,second=1,next;
for(int i=1;i<=num;i++)
{ 
System.out.print(first+" ");
next=first+second;
first=second;
second=next;
}
}
}
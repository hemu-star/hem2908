class How_to_find_min_element
{
public static void main(String[] args)
{
int[] a={50,20,60,30,40,10};
int min=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]<min)
{
min=a[i];
}
}
System.out.println("min element of the array is :"+min );
}
}
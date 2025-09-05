class How_to_find_max_element
{
public static void main(String[] args)
{
int[] a={50,10,20,30,40,60};
int max=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("max element of the array is:"+max);

}
}
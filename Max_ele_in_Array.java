class Max_ele_in_Array
{ 
public static void main(String[] args)
{ 
int[] a={4326,57,8956,89659,1257,907,54784,6};
int max=a[0];
for(int i=0;i<a.length;i++)
{
if(a[i]>max)
max=a[i];
}
System.out.println(max+":is maximum element in the array");
}
}
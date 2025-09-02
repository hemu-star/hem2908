class Min_ele_in_Array
{ 
public static void main(String[] args)
{
int[] a={10,39,49,47,4,94,9,2,1};
int min=a[0];
for(int i=0;i<a.length;i++)
{ 
if(a[i]<min)
min=a[i];
}
System.out.println("min element of the array is:"+min);

}
}
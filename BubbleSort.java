
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4 , 2, 9, 1, 3, 6, 7};
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				boolean flag=false;
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=true;
				}
				if(flag==false)
				{
					break;
				}
			}
		}
		
		for(int x:a)
		{
			System.out.print(x+" ");
		}
	}

}

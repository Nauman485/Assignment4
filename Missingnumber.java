package geekster;

public class Missingnumber {
	
	public static void main(String []args) {
		
		int []a= {1,2,3,4,5,6,7,8,9,11,12,13,14,15};
		int num=1;
		for(int i=0;i<a.length;i++)
		{
			if(num==a[i]) {
				num+=1;
			}
			else {
			   System.out.println("Missing number = "+num);
			   break;
			}
		}
	}

}

package geekster;

public class Findnum {
	
	public static void main(String []args) {
		int []a= {23,56,3,4,6,89,45,67};
		int num=67;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
			if(num==a[i]) {
				System.out.println("Number is present at index= "+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Number is not present");
		}
	}

}

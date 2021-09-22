package geekster;

public class Duplicate {
	
	public static void main(String []args) {
		int []a= {3,56,67,45,6};
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
		    int num =a[i];
			for(int j=i+1;j<a.length;j++) {
				if(num==a[j]) {
					System.out.println("Number is Duplicate");
					flag=true;
					break;
				}
			}
		}
		if(flag==false) {
			System.out.println("Number is not Duplicate");
		}
	}

}

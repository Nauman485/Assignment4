package geekster;

public class Minmax {
	
	public static void main(String []args) {
		
		int []a= {3,5,78,45,21,46,53,16};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Maximum = "+max);
		System.out.println("Minimum = "+min);
	}

}

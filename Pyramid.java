package geekster;
import java.util.*;

public class Pyramid {
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-1+i;j++) {
				if(i<=n-j) {
				    System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}

}

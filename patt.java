package random;
import java.io.IOException;

public class patt {
	public static void main(String[] args)throws IOException {
		int n=5,i,j,k;
		for(i=0;i<(((n*2)-1)*3)-2;i++)
			System.out.print("* ");
		System.out.println();
		for(i=1;i<n-1;i++) {
			for(j=0;j<i;j++)
				System.out.print("  ");
			for(k=0;k<3;k++) {
				System.out.print("* ");
				for(j=0;j<7-(i*2);j++)
					System.out.print("  ");
				System.out.print("* ");
				for(j=1;j<i*2;j++)
					System.out.print("  ");
			}
			System.out.println();
		}
		for(i=1;i<n;i++)
			System.out.print("  ");
		System.out.print("* ");
		for(k=0;k<2;k++) {
			for(i=1;i<(n-1)*2;i++)
				System.out.print("  ");
			System.out.print("* ");
		}
		System.out.println();
		for(i=n-2;i>0;i--) {
			for(j=0;j<i;j++)
				System.out.print("  ");
			for(k=0;k<3;k++) {
				System.out.print("* ");
				for(j=0;j<7-(i*2);j++)
					System.out.print("  ");
				System.out.print("* ");
				for(j=1;j<i*2;j++)
					System.out.print("  ");
			}
			System.out.println();
		}
		for(i=0;i<(((n*2)-1)*3)-2;i++)
			System.out.print("* ");
	}
}

import java.util.*;

public class Vaksin{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inputkan bulan apa");
		int b = sc.nextInt();
		System.out.println("Inputkan tahun apa");
		int t = sc.nextInt();
		if(v1 == 1 & v2 == 1)
			System.out.println("Boleh 1, 2, dan 3");
		else if(v1 == 1 & v2 == 2)
			System.out.println("Boleh 2 dan 3");
		else if(v1 == 1 & v2 == 3)
			System.out.println("Boleh 3");
		else if(v1 == 2 & v2 == 1)
			System.out.println("Boleh 1, 2, dan 3");
		else if(v1 == 2 & v2 == 2)
			System.out.println("Boleh 2 dan 3");
		else if(v1 == 2 & v2 == 3)
			System.out.println("Boleh 3");
		else if(v1 == 3 & v2 == 1)
			System.out.println("Boleh 3");
		else if(v1 == 3 & v2 == 2)
			System.out.println("Boleh 3");
		else if(v1 == 3 & v2 == 3)
			System.out.println("Boleh 3");
		
	}
}
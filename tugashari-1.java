import java.util.*;
public class tugashari {
	public static void main(String[] args) {
int month,year;
System.out.println("pilih bulan dari 1-12");
Scanner input = new Scanner(System.in);
month = input.nextInt();
System.out.println("tahun berapa?");
year = input.nextInt();
switch (month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		System.out.print(month +", 31 Hari" );	
	break;
	case 4:
	case 6:
	case 9:
	case 11:
		System.out.print(month +", 30 Hari" );	
	break;
	
	case 2:

if((year % 400 == 0) | (year % 400 !=0 & year % 100 !=0 & year % 4 ==0))
	System.out.print(month + ", 29");
else
	System.out.print(month + ", 28");
default:
	System.out.print("kamu typo");
	break;
}	
	}
}
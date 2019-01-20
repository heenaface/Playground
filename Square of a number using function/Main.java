import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner sc = new Scanner(System.in);
//System.out.print("Please enter a number: ");
int num = sc.nextInt();
System.out.println( square(num));
}
public static int square(int num) 
{
return num * num;   
	} 
}
import java.util.Scanner;
public class Program {
        public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Amount: ");
		int amount = scanner.nextInt();

		//your code goes here
		int fmonth = (int) (amount * .10);
        int a1 = amount - fmonth;
        int smonth = (int) (a1 * .10);
        int a2 = a1 - smonth;
        int tmonth = (int) (a2 * .10);

        System.out.println(a2 - tmonth);
        
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        String news = "";
        for(int i = arr.length - 1; i >= 0; i--){
            news = news + arr[i];
        }

        System.out.println(news);
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
*/
        int f = 1, i = 2;

        while(++i < 5)
            f *= i;

            System.out.print(f);
	}


    
}
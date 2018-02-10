
public class Zadanie2 {

	public static void main(String[] args) {
		int n =343;
		int a = n / 100;
		int b = n % 10;
		int c = (n / 10) % 10;
		System.out.println("Сумма цифр числа " + n + " равна " + (a + b + c));
	}

}

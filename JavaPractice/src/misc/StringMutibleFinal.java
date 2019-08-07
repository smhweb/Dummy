package misc;

public class StringMutibleFinal {

	public static void main(String[] args) {

		String a = "Java";
		String b = "Java";
		String c = a;
		String d = a.concat("");
		String e ="  Java  ";
		String f = e.trim();
		String x = "Ja";
		String y = "va";
		String z = x.concat(y);
		
		System.out.println(a.equals(b));
		System.out.println(a == b);		
		System.out.println("=============================");
		System.out.println(a.equals(c));
		System.out.println(a == c);
		System.out.println("=============================");
		System.out.println(a.equals(d));
		System.out.println(a == d);
		System.out.println("=============================");
		System.out.println(a.equals(e));
		System.out.println(a == e);
		System.out.println("=============================");
		System.out.println(a.equals(f));
		System.out.println(a == f);
		System.out.println("=============================");
		System.out.println(a.equals(z));
		System.out.println(a == z);
	}

}

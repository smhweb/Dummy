package misc;

public class RemoveJunkFromExpression {

	public static void main(String[] args) {

		String x = "Smi#$&*)%#!li=ng i^^$s goo$#d for %$~(*#heal?th. 653985";
		String y = "123456789  -- Al<%@l fac==es<^$ are creat+_ed <^@~*by God.";
		
		//  regular expression: [^a-zA-Z0-9- ]
		
		x = x.replaceAll("[^a-zA-Z0-9- ]", "");
		System.out.println(x);
		
		y = y.replaceAll("[^a-zA-Z0-9- ]", "");
		System.out.println(y);
	}
}

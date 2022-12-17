/**
 * 
 */
package br.com.eduardomelle.effectivejava;

/**
 * @author eduardo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PhoneNumber phoneNumber = PhoneNumber.of(11, 996201490);
		System.out.println(phoneNumber);
		System.out.printf("%s", phoneNumber);
	}

}

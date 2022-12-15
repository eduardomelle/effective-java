/**
 * 
 */
package br.com.eduardomelle.effectivejava;

/**
 * @author eduardo
 *
 */
public class PhoneNumber {

	private final int areaCode;

	private final int number;

	private PhoneNumber(int areaCode, int number) {
		super();
		this.areaCode = areaCode;
		this.number = number;
	}

	public static PhoneNumber of(int areaCode, int number) {
		return new PhoneNumber(areaCode, number);
	}

}

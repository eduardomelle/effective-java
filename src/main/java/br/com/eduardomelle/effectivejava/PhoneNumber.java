/**
 * 
 */
package br.com.eduardomelle.effectivejava;

import com.google.common.base.Preconditions;

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
		Preconditions.checkArgument(areaCode > 0, "areaCode must be greater than 0");
		Preconditions.checkArgument(number > 0, "number must be greater than 0");

		return new PhoneNumber(areaCode, number);
	}

}

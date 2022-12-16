/**
 * 
 */
package br.com.eduardomelle.effectivejava;

import java.util.Objects;

import com.google.common.base.MoreObjects;
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

	@Override
	public int hashCode() {
		return Objects.hash(this.areaCode, this.number);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;

		if (obj instanceof PhoneNumber) {
			PhoneNumber other = (PhoneNumber) obj;
			return this.areaCode == other.areaCode && Objects.equals(this.number, other.number);
		}

		return false;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("areaCode", this.areaCode).add("number", this.number).toString();
	}

}

/**
 * 
 */
package br.com.eduardomelle.effectivejava;

import java.util.Comparator;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Objects;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/**
 * @author eduardo
 *
 */
public class PhoneNumber implements Formattable, Comparable<PhoneNumber> {

	private static final Comparator<PhoneNumber> COMPARATOR = Comparator.comparingInt((PhoneNumber p) -> p.areaCode)
			.thenComparingInt(p -> p.number);

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

	@Override
	public void formatTo(Formatter formatter, int flags, int width, int precision) {
		formatter.format("(%d) %d", this.areaCode, this.number);
	}

	public int getAreaCode() {
		return areaCode;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public int compareTo(PhoneNumber o) {
		// return ComparisonChain.start().compare(this.areaCode,
		// this.areaCode).compare(this.number, o.number).result();
		return COMPARATOR.compare(this, o);
	}

}

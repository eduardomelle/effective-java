/**
 * 
 */
package br.com.eduardomelle.effectivejava.visitor;

/**
 * @author eduardo
 *
 */
public class PatternMatching {

	public int run(CreditCard card) {
		return switch (card) {
		case Visa v -> 1;
		case MasterCard m -> 2;
		};
	}

}

class OtherPatternMatching {

	public String run(CreditCard card) {
		return switch (card) {
		case Visa v -> "abc";
		case MasterCard m -> "cde";
		};
	}

}

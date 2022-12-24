/**
 * 
 */
package br.com.eduardomelle.effectivejava;

import java.util.function.IntBinaryOperator;

/**
 * @author eduardo
 *
 */
public enum Operation {

	ADD(AddOperation::compute), SUBTRACT((x, y) -> x - y), MULTIPLY((x, y) -> x * y), DIVIDE((x, y) -> x / y);

	private final IntBinaryOperator operator;

	Operation(IntBinaryOperator operator) {
		this.operator = operator;
	}

	public int compute(int x, int y) {
		return this.operator.applyAsInt(x, y);
	}

}
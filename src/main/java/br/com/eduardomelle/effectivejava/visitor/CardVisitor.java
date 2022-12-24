/**
 * 
 */
package br.com.eduardomelle.effectivejava.visitor;

/**
 * @author eduardo
 *
 */
public interface CardVisitor<T> {

	T visit(Visa visa);

	T visit(MasterCard masterCard);

}

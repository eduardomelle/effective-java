/**
 * 
 */
package br.com.eduardomelle.effectivejava;

/**
 * @author eduardo
 *
 */
@FunctionalInterface
public interface MyInterface {

	void doSomething();

	default void doOtherThing() {
		System.out.println("abc");
	}

}

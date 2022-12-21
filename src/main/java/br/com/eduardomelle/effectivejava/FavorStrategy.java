/**
 * 
 */
package br.com.eduardomelle.effectivejava;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.function.Supplier;

/**
 * @author eduardo
 *
 */
public class FavorStrategy {

	private final Supplier<String> supplier;

	private FavorStrategy(Supplier<String> supplier) {
		super();
		this.supplier = supplier;
	}

	public static FavorStrategy of(Supplier<String> supplier) {
		checkNotNull(supplier);
		return new FavorStrategy(supplier);
	}

	public void doSomething() {
		System.out.println("a");
		System.out.println(this.supplier.get());
		System.out.println("b");
	}

	public static void main(String[] args) {
		FavorStrategy.of(() -> "123").doSomething();
		FavorStrategy.of(() -> "321").doSomething();
	}

}

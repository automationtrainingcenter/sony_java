package abstraction;

public class OuterAndInnerImpl implements Outer, Outer.Inner{

	@Override
	public void methodOne() {
		System.out.println("methodOne of Outer interface");
	}

	@Override
	public void methodTwo() {
		System.out.println("methodTwo of Inner interface");
	}

	@Override
	public Inner method() {
		return this;
	}

}

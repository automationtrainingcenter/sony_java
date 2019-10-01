package abstraction;

public class MultipleIntefaceImpl implements InterfaceOne, InterfaceTwo{

	@Override
	public void methodOne() {
		System.out.println("methodOne of InterfaceOne definition in MultipleIntefaceImpl");
	}

	@Override
	public void methodTwo() {
		System.out.println("methodTwo of InterfaceTwo definition in MultipleIntefaceImpl");
	}

}

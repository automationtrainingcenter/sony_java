package polymorphism;

public class RuntimePolyChild extends RuntimePolyParent{

	@Override
	public void add(int a, String b) {
		if(b.matches("^[0-9]*$")) {
			int ib = Integer.parseInt(b);
			System.out.println(a+ib);
		}else {
			super.add(a, b);
		}
	}

}

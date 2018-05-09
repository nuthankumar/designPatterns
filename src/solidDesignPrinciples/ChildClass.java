package solidDesignPrinciples;

public class ChildClass extends SolidDesignPrinciples{
	@Override
	public void makeDesign() {
		System.out.println("Child Making design");
	}
	@Override
	public void changeDesign() {
		try {
			throw new IcantChangeDesignException("I cant change design");
		} catch (IcantChangeDesignException e) {
			e.printStackTrace();
		}
	}
}

package solidDesignPrinciples;

public class SolidDesignPrinciples implements DesignPrinciple{
	/**
	 * SOLID
	 * S - Single Responsibility principle
	 * 		This class has only one responsibility of Design requirements.
	 * O - Open/Closed Principle
	 * 		This class is open to extention and closed for modifications.
	 * L - Liskov principle
	 * 		ChildClass has all the methods either used from the parent or has its implementations.
	 * 		I cant changedesign is breaking liskov principle
	 * I - Interface Segregation principle
	 * 		Core Design serves a different code implementation. 
	 * 		only for the client which needs core design implementations.
	 * D - Dependency Inversion principle
	 * 		Design patterns (Builder, factory pattern allows dependancy inversion.
	 * 		More onto abstraction.
	 */
	@Override
	public void makeDesign() {
		System.out.println("Making design");
	}

	@Override
	public void changeDesign() {
		System.out.println("Changing design");
	}

	@Override
	public void coreDesign() {
		System.out.println("Core design");
	}
}

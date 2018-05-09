package solidDesignPrinciples;

public class IcantChangeDesignException extends Exception{

	private static final long serialVersionUID = 1L;
	IcantChangeDesignException(String s){
		super(s);
	}
}

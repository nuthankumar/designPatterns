package otherPatterns;

public class BAssignment {
	static BPen pp=new BAdapter();
	public static void write(String s) {
		pp.write(s);
	}
	public static void main(String args[]) {
		BAssignment.write("My first project");
	}
}

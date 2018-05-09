package otherPatterns;

public class BAdapter implements BPen{

	BPilotPen pp = new BPilotPen();
	@Override
	public void write(String s) {
		pp.mark(s);
	}

}

package otherPatterns;

public class APhone {

	int ram;
	String OS;
	String processor;

	public APhone() {
	}

	public APhone(int ram, String oS, String processor) {
		super();
		this.ram = ram;
		OS = oS;
		this.processor = processor;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String toString() {
		return ram+OS+processor;
	}
}

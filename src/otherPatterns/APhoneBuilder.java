package otherPatterns;

public class APhoneBuilder {
	int ram;
	String OS;
	String processor;
	public APhoneBuilder getRam() {
		return this;
	}
	public APhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public APhoneBuilder getOS() {
		return this;
	}
	public APhoneBuilder setOS(String OS) {
		this.OS = OS;
		return this;
	}
	public APhoneBuilder getProcessor() {
		return this;
	}
	public APhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public APhone getPhone() {
		APhone phone= new APhone(ram,OS,processor);
		return phone;
	}
	
}

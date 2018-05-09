package otherPatterns;

import java.util.HashMap;
import java.util.Map.Entry;

public class ABuilder {

	public static void main(String[] args) {
		
		APhone phone = new APhoneBuilder().setRam(3).setOS("Nuthan").setProcessor("I7").getPhone();
		System.out.println(phone.toString());

		HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  for(Entry<Integer, String> m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	}

}

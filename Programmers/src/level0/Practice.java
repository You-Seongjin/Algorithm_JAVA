package level0;

public class Practice {
	
	public static void main(String[] args) {
		
		String str = "A3BC5DE7F8G0H67IJK";
		StringBuffer str_s = new StringBuffer();
		
		for(int i=0 ; i < str.length(); i++) {
			if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
				str_s.append(str.charAt(i));
			}
		}
		
		System.out.println(str_s);
		
	}

}

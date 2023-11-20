package inputtest;

import java.io.*;

public class ConsoleTest {

	public static void main(String[] args) {
		
		Console cs = System.console();
		if(cs != null) {
			 String input = cs.readLine("입력: ");
	         System.out.println("출력: " + input);
		}else {
			 System.out.println("error");
		}
		
	}

}

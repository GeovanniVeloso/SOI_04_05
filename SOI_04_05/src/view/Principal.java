package view;

import controller.ThreadPing;

public class Principal {

	public static void main(String[] args) {
		String os  = System.getProperty("os.name");
		if(os.contains("Linux")) {
			for(int i = 0 ; i < 3 ; i++) {
				Thread thPing = new ThreadPing(i);
				thPing.start();
			}
		}else {
			System.out.println("O seu SO não é Linux");
		}
	}

}

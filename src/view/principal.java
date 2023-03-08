package view;

import controller.Threadid;

public class principal {
	
	public static void main(String args[]) {
		
		for (int idThread = 0 ; idThread < 5 ; idThread++) {
			Thread threadid = new Threadid(idThread);
			threadid.start();
			
		}
	}

}

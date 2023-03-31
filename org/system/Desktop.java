package org.system;

public class Desktop extends Computer{

	
	public void desktopSize() {
		
		System.out.println("DESK SIZE");
		
	}
	
	public static void main(String[] args) {
		
		Desktop desk = new Desktop();
		desk.desktopSize();
		desk.computerModel();
		
		System.out.println("CALL DESK AND COMPUTER");
		
				
	}
}



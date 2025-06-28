package com.pssticket.repositry.dp;

public class PssTicketDp {
	
	
	
	private static PssTicketDp sPssTicketDp;
	
	
	
	public static PssTicketDp getInstance() {
		
		
		if(sPssTicketDp==null) {
			
			sPssTicketDp =new PssTicketDp();
		}
		
		return sPssTicketDp;
		
	}
	
    
	
	
	
	
	
	
	
	
	
	

}

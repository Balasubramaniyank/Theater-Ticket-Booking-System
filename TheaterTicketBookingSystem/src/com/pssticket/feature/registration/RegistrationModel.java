package com.pssticket.feature.registration;

import com.pssticket.repositry.dp.PssTicketDp;

public class RegistrationModel {

	private final RegistrationView view;
	
	public RegistrationModel(RegistrationView view) {
		
		this.view=view;
	}

	public void init() {
		
		if(PssTicketDp.getInstance()==null) {
			
			 view.proceedRegister();
			
		}
		
	}
	
	
	
	
	
	
}

package com.zweihander.navigation.Exceptions;


public class Exceptions extends Throwable{
	String reason;
	 
	public Exceptions(String reason){
		this.setReason(reason);
	}
	
	protected void setReason(String reason){
		this.reason = reason;
	}
	
	public String getReason(){
		return reason;
	}
    
}

package com.codingdojo.phoneclass;
import com.codingdojo.phoneinterface.Ringable;

public class Galaxy extends Phone implements Ringable {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }//inheritance
	
    @Override
    public String ring() {
    	return this.getRingTone();
    }
    
    @Override
    public String unlock() {
    	return "Unlocked via finger print";
    }
    
    @Override
    public void displayInfo() {
    	System.out.println("Galaxy " + this.getVersionNumber() + " from " + this.getCarrier());  
    	System.out.println("Battery Percentage: " + this.getBatteryPercentage());
       
    }
}
package com.codingdojo.phoneclass;
import com.codingdojo.phoneinterface.Ringable;

public class Iphone extends Phone implements Ringable {
	
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone); 
    }//inheritance / invoke superclass method
    
    @Override
    public String ring() {
        return this.getRingTone();
    }
        
    @Override
    public String unlock() {
        return "Unlocked with facial recognition";
    }
    
    //Override
    @Override
    public void displayInfo() {
    	System.out.println("IPhone " + this.getVersionNumber() + " from " + this.getCarrier());  
    	System.out.println("Battery Percentage: " + this.getBatteryPercentage());        
    }
}

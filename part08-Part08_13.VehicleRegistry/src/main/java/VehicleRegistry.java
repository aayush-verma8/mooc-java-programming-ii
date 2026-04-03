
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aayus
 */
public class VehicleRegistry {
    private HashMap<LicensePlate,String>registry;
    
    public VehicleRegistry(){
        this.registry=new HashMap<>();
        }
    public boolean add(LicensePlate licensePlate, String owner){
        boolean found=this.registry.containsKey(licensePlate);
        boolean hasowner=this.registry.get(licensePlate)!=null;
        
        if(found && hasowner){
            return false;
        }
        this.registry.put(licensePlate, owner);
        return true;
    }
    public String get(LicensePlate licensePlate){
        return this.registry.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate){
    if(!this.registry.containsKey(licensePlate)){
        return false;
        }
    this.registry.remove(licensePlate);
        return true;
    }
    public void printLicensePlates(){
        for(LicensePlate licensePlate:this.registry.keySet()){
            System.out.println(licensePlate);
        }
    }
    public void printOwners() {
        ArrayList<String> uniqueOwners = new ArrayList<>();
        for (String owner: this.registry.values()) {
            if (!uniqueOwners.contains(owner)) {
                uniqueOwners.add(owner);
                System.out.println(owner);
            }
        }
    }
}

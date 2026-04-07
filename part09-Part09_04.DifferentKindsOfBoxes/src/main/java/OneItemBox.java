/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aayus
 */
public class OneItemBox extends Box {
    private Item onebox;
    
    public OneItemBox(){
    }
    public void add(Item item){
        if(onebox!=null){
            return;
        }
        this.onebox=item;
    }
    public boolean isInBox(Item item) {        
        return this.onebox != null && this.onebox.equals(item);
    }
}

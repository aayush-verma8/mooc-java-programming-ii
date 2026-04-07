
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aayus
 */
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item>items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity=capacity;
        this.items=new ArrayList<>();
    }
    public void add(Item item){
        int newweight=item.getWeight();
        
        if(this.capacity-newweight<0){
            return;
        }
        this.capacity-=newweight;
        this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
}

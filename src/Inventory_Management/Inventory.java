package Inventory_Management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {
    HashMap<String,T> map = new HashMap<>();
    Inventory(HashMap<String,T> map){
        this.map = map;
    }
    public void AddItem(T item) throws InvalidQuantityException,DuplicateItemException{
        if(item.quantity<0){
            throw new InvalidQuantityException("Quantity cannot be negative: " + item.quantity);
        }
        else if(map.containsKey(item.id)){
            throw new DuplicateItemException("Item with ID " + item.id + " already exists.");
        }
        else{
            map.put(item.id,item);
        }
    }
    public void removeItem(T item){
        if(map.containsKey(item.id)){
            map.remove(item.id);
        }
    }
    public T getItem(String id){
        if(map.containsKey(id)){
            return map.get(id);
        }
    }
    public List<T> getAll(){
        return new ArrayList<>(map.values());
    }
}

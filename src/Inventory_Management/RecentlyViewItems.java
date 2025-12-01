package Inventory_Management;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewItems<T extends Item> {
    LinkedList<T> list = new LinkedList<>();
    final int MAX_SIZE = 3;
    RecentlyViewItems(){
        super();
        list = new LinkedList<>();
    }
    public void removeLast(){
        list.remove(list.size()-1);
    }
    public void addRecentlyViewedItem(T item){
        list.remove(item);
        list.addFirst(item);

        if (list.size() > MAX_SIZE) {
            list.removeLast();
        }
    }
    public List<T> getRecentlyViewedItems() {
        return new ArrayList<>(list);
    }

}

package Inventory_Management;

public class Order implements Comparable<Order> {
    String orderId;
    boolean isExpress;
    Order(boolean isExpress,String orderId){
        this.isExpress = isExpress;
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }
    public boolean getIsExpress(){
        return this.isExpress;
    }
    public int compareTo(Order o) {

        if (this.isExpress && !o.isExpress) return -1;
        if (!this.isExpress && o.isExpress) return 1;

        return this.orderId.compareTo(o.orderId);
    }

}

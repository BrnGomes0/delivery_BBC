package bbc.api.application.extern;

public enum StatusOrder {
    ORDER_READY("Order ready for delivery"),
    ORDER_WAY("Order on the way");

    // Attributes
    private String value;

    // Constructor
    StatusOrder(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}

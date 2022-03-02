package five.entity;

public class Order extends AbstractEntity {
    private Integer orderId;

    @Override
    public Integer getId() {
        return orderId;
    }
}

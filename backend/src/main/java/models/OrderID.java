package models;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderID implements Serializable {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long orderPosition;

    public OrderID() {
    }

    public OrderID(Long orderPosition) {
        this.orderPosition = orderPosition;
    }

    public OrderID(Long id, Long orderPosition) {
        this.id = id;
        this.orderPosition = orderPosition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderPosition() {
        return orderPosition;
    }

    public void setOrderPosition(Long orderPosition) {
        this.orderPosition = orderPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderID orderID = (OrderID) o;
        return id.equals(orderID.id) && orderPosition.equals(orderID.orderPosition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderPosition);
    }
}
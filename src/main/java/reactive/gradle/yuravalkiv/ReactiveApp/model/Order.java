package reactive.gradle.yuravalkiv.ReactiveApp.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.Objects;

public class Order {
    @Id
    private Long id;
    private String details;
    private BigDecimal amount;
    private Long client_id;

    public Order() {
    }

    public Order(Long id, String details, BigDecimal amount, Long client_id) {
        this.id = id;
        this.details = details;
        this.amount = amount;
        this.client_id = client_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return Objects.equals(getDetails(), order.getDetails()) && Objects.equals(getAmount(), order.getAmount()) && Objects.equals(getClient_id(), order.getClient_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDetails(), getAmount(), getClient_id());
    }
}

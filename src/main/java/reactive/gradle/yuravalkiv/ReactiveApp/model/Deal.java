package reactive.gradle.yuravalkiv.ReactiveApp.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Deal {
    @Id
    private Long id;
    private LocalDate date;
    private BigDecimal amount;
    private String conditions;
    private Long client_id;

    public Deal() {
    }

    public Deal(Long id, LocalDate date, BigDecimal amount, String conditions, Long client_id) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.conditions = conditions;
        this.client_id = client_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
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
        if (!(o instanceof Deal deal)) return false;
        return Objects.equals(getDate(), deal.getDate()) && Objects.equals(getAmount(), deal.getAmount()) && Objects.equals(getConditions(), deal.getConditions()) && Objects.equals(getClient_id(), deal.getClient_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate(), getAmount(), getConditions(), getClient_id());
    }
}

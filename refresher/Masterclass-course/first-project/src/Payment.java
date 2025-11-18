import java.io.Serializable;

public class Payment implements Serializable {
    private String type;
    private Double amount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Payment(String type, Double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }

}

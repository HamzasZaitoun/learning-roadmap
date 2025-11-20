import java.io.Serializable;

public class Payment implements Serializable {
    private PaymentType type;
    private Double amount;


    public Payment(PaymentType type, Double amount) {
        this.type = type;
        this.amount = amount;
    }


    public PaymentType getType() {
        return type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }



    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public double getFees() {
        return switch (this.type) {
            case VISA -> amount * 0.15d;
            case PAYPAL -> amount * 0.20d;
            default -> 0.0d;
        };
    }

    @Override
    public String toString() {
        return "Payment{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }

}

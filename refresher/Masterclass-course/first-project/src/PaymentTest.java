import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    private Payment payment;

    
    @BeforeEach
    public void setup()
    {
        System.out.println("in method!");
        payment = new Payment(PaymentType.CASH, 143.4d);
    }

    @Test
    void getType() {
        PaymentType act = payment.getType();
        assertEquals(PaymentType.CASH,act);
    }

    @Test
    void getAmount() {
        double price = payment.getAmount();
        assertEquals(143.4d,price);
    }

    @Test
    void getFees() {
    }
}
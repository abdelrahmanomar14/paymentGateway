import org.example.PaymentPage;
import org.testng.annotations.Test;

public class PayCardTest extends BaseTest {

@Test
    public void PaymentPage() {
        PaymentPage paymentPage = new PaymentPage(driver);
    paymentPage.enterCardNumberField("012222233331");
    paymentPage.enterExpiryDateField("22");
    paymentPage.enterCVVField("355");
    paymentPage.payCardButton();
    }
}

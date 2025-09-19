package pe.ffernacu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.ffernacu.model.Payment;
import pe.ffernacu.model.PaymentType;
import pe.ffernacu.service.GeneratePayment;
import org.springframework.boot.CommandLineRunner;
import pe.ffernacu.service.Impl.CashPaymentImpl;
import pe.ffernacu.service.Impl.CreditCardPaymentImpl;

@SpringBootApplication
public class Main implements CommandLineRunner{

    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private GeneratePayment generatePayment;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args){
        log.info("Start!");
        useCase2();
        log.info("End");
    }

    private static void useCase2() {

        Payment newPayment = new Payment(10.0, PaymentType.CREDIT);
        var payment = switch (newPayment.paymentType()){
            case CASH -> new CashPaymentImpl();
            case CREDIT-> new CreditCardPaymentImpl();
        };
        var result = payment.registerPayment();
        log.info(result);
    }

    private static void useCase() {
        String flag = "C";

        var payment = switch (flag){
          case "A" -> new CashPaymentImpl();
          case "B" -> new CreditCardPaymentImpl();
          default -> throw new RuntimeException();

        };
        var result = payment.registerPayment();
        log.info(result);
    }

}
package pe.ffernacu.service.Impl;

import org.springframework.stereotype.Service;
import pe.ffernacu.service.GeneratePayment;

@Service
public class CashPaymentImpl implements GeneratePayment {

    @Override
    public String registerPayment() {
        return "CashPaymentImpl";
    }
}

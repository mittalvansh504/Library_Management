package com.management.Library_Management.Controller;

import com.management.Library_Management.requests.RequestForPayment;
import com.management.Library_Management.service.PaymentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PaymentController {

    @Autowired
    private PaymentInterface paymentInterface;

    @PostMapping("/payment")
    public String paymentmethod(@RequestBody RequestForPayment requestForPayment){
        paymentInterface.addpayment(requestForPayment);
        return "Done";
    }
}

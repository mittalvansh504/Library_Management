package com.management.Library_Management.service;

import com.management.Library_Management.entities.Payment;
import com.management.Library_Management.repository.PaymentRepository;
import com.management.Library_Management.requests.RequestForPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentImpl implements PaymentInterface{

    @Autowired
    private  PaymentRepository paymentRepository;

    @Override
    public void addpayment(RequestForPayment requestForPayment) {
        Payment payment = new Payment();
        payment.setAmount(requestForPayment.getAmount());
        payment.setCurrency(requestForPayment.getCurrency());
        payment.setCustomer_id(requestForPayment.getCustomer_id());
        paymentRepository.save(payment);
    }
}

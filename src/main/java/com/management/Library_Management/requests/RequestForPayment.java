package com.management.Library_Management.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestForPayment {

    private int amount;
    private String currency;
    private String customer_id;
}

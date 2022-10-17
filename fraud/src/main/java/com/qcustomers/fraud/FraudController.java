package com.qcustomers.fraud;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/fraud-check")
public class FraudController {

    private final FraudCheckService fraudCheckService;

//    public FraudController(FraudCheckService fraudCheckService) {
//        this.fraudCheckService = fraudCheckService;
//    }

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(
        @PathVariable("customerId") Integer customerId) {
        boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);

        return new FraudCheckResponse(isFraudulentCustomer);
    }
}

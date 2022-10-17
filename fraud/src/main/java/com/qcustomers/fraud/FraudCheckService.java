package com.qcustomers.fraud;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;
//      AllArgsConstructor removes the need for this constructor
//    public FraudCheckService(FraudCheckHistoryRepository fraudCheckHistoryRepository) {
//        this.fraudCheckHistoryRepository = fraudCheckHistoryRepository;
//    }

    // tells us that a check took place
    public boolean isFraudulentCustomer(Integer customerId) {
        // dummy function
//        return false;
        fraudCheckHistoryRepository.save(FraudCheckHistory.
                builder()
                .customerId(customerId)
                .isFraudster(false)
                .createdAt(LocalDateTime.now())
                .build()
        );

        return false;
    }
}

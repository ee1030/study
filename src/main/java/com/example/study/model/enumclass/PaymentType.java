package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentType {
    CARD(0, "카드결제", "카드로 결제함"),
    CHECK_CARD(1, "체크카드 결제", "체크카드로 결제함"),
    BANK_TRANSFER(2, "계좌이체 결제", "계좌이체로 결제함")
    ;
    private Integer id;
    private String title;
    private String description;

}

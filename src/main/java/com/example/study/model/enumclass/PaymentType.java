package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentType {
    CARD(0, "카드결제", "카드로 결제함"),
    CASH(1, "현금결제", "현금으로 결제함")
    ;
    private Integer id;
    private String title;
    private String description;

}

package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderGroupStatus {

    ORDERING(0, "주문 완료", "주문이 완료되어 결제를 기다림"),
    COMPLETE(1, "결제 완료", "결제가 완료됨"),
    CONFIRM(2, "결제 확인중", "결제완료 확인중")
    ;

    private Integer id;
    private String title;
    private String description;
}

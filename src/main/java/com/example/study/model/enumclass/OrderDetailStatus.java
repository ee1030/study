package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderDetailStatus {

    COMPLETE(0, "결제 완료", "상품 결제가 완료됨"),
    WAITING(1, "결제 대기", "결제 대기 중")
    ;

    private Integer id;
    private String title;
    private String description;
}

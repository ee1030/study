package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    private String name;

    private String title;

    private String content;

    private BigDecimal price;

    private String brandName;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime updatedAt;

    private String updatedBy;

    private Long partnerId;

    // LAZY = 지연로딩, EAGER = 즉시로딩
    // LAZY = SELECT * FROM USER WHERE id = ?
    // EAGER = -> 데이터가 많을 때 모든 데이터를 조인하기 때문에 성능 저하를 가져올 수 있음
    // EAGER 는 1:1 연관관계에 있어 한건만 존재할때 사용 추천
    // item_id = order_detail.item_id
    // user_id = order_detail.user_id
    // where item.id = ?
}

package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer price;

    private String content;

    // LAZY = 지연로딩, EAGER = 즉시로딩
    // LAZY = SELECT * FROM USER WHERE id = ?
    // EAGER = -> 데이터가 많을 때 모든 데이터를 조인하기 때문에 성능 저하를 가져올 수 있음
    // EAGER 는 1:1 연관관계에 있어 한건만 존재할때 사용 추천
    // item_id = order_detail.item_id
    // user_id = order_detail.user_id
    // where item.id = ?
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "item")
    private List<OrderDetail> orderDetailList;
}

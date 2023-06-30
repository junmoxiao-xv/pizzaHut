package com.xyj.xyjcommon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartVO {

    private Long id;

    private Long mid;

    private String name;

    private String image;

    private BigDecimal price;

    private Integer amount;
}

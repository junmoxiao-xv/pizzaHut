package com.xyj.xyjcommon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    private Long id;

    private String name;

    private String ingredients;

    private String intro;

    private BigDecimal price;

    private String image;
}
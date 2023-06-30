package com.xyj.xyjcommon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    private Long id;

    private Long uid;

    private Long mid;

    private Integer amount;
}

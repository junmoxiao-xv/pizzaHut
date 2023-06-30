package com.xyj.xyjcommon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderVO {

    private Long id;

    private Long uid;

    private String username;

    private String email;

    private String address;

    private String menuname;

    private String image;

    private BigDecimal sumprice;

    private Integer amount;

    private Date usetime;

    private Date createtime;

    private String remark;

    private String status;
}

package com.xyj.xyjcommon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;

    private Long uid;

    private Long mid;

    private Integer amount;

    private Date usetime;

    private Date createtime;

    private String remark;

    private String status;
}

package com.cherish.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Cherish
 * @version 1.8.0_121
 * @date 2020/11/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Items implements Serializable {
    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createtime;
    private String detail;
}

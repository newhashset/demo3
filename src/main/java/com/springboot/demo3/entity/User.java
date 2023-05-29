package com.springboot.demo3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author :信仰
 * @Date :2023/5/26 14:15
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private int userId;
    private String userName;
    private String userPassword;
}

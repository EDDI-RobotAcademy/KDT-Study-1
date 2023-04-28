package com.example.demo.productProblem.controller.form;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class RequestProductModifyForm {
    final private String name;
    final private String detail;
    final private String expireDate;
}

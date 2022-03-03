package com.cc_cs.demo.entity;

import lombok.Data;

@Data
public class Result {
    private String rid;
    private String search_keyword;
    private String result_code_id;
    private String score;
}

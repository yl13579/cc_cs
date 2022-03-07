package com.cc_cs.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Code {
    private String cid;
    private String rcode;
    private String pcode;
    private String source_url;
    private String type;
}

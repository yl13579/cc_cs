package com.cc_cs.demo.service;

import com.cc_cs.demo.entity.Code;
import com.cc_cs.demo.mapper.CodeMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

public interface CodeService {
    Code selectCodeByCid(String cid);
    Collection<Code> getAllByType(String type);
    void insertCode(Code code);
    void updateCode(Code code);
    void deleteCode(String cid);
}

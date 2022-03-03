package com.cc_cs.demo.mapper;

import com.cc_cs.demo.entity.Code;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

@Mapper
public interface CodeMapper {
    Code selectCodeByCid(String cid);
    Collection<Code> getAllByType(String type);
    void insertCode(Code code);
    void updateCode(Code code);
    void deleteCode(String cid);
}


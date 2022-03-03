package com.cc_cs.demo.mapper;

import com.cc_cs.demo.entity.Result;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResultMapper {
    Result selectResultByRid(String rid);
    void insertResult(Result result);
    void updateResult(Result result);
    void deleteResultByRid(String rid);
}

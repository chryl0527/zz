package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsProjectProd;
import com.sdsoon.modular.system.po.SsProjectProdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SsProjectProdMapper {
    long countByExample(SsProjectProdExample example);

    int deleteByExample(SsProjectProdExample example);

    int deleteByPrimaryKey(String projectProdId);

    int insert(SsProjectProd record);

    int insertSelective(SsProjectProd record);

    List<SsProjectProd> selectByExample(SsProjectProdExample example);

    SsProjectProd selectByPrimaryKey(String projectProdId);

    int updateByExampleSelective(@Param("record") SsProjectProd record, @Param("example") SsProjectProdExample example);

    int updateByExample(@Param("record") SsProjectProd record, @Param("example") SsProjectProdExample example);

    int updateByPrimaryKeySelective(SsProjectProd record);

    int updateByPrimaryKey(SsProjectProd record);
}
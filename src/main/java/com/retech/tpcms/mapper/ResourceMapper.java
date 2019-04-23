package com.retech.tpcms.mapper;

import com.retech.tpcms.entity.Resource;
import com.retech.tpcms.entity.ResourceExample;
import com.retech.tpcms.entity.ResourceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceMapper {
    int countByExample(ResourceExample example);

    int deleteByExample(ResourceExample example);

    int deleteByPrimaryKey(Integer code);

    int insert(ResourceWithBLOBs record);

    int insertSelective(ResourceWithBLOBs record);

    List<ResourceWithBLOBs> selectByExampleWithBLOBs(ResourceExample example);

    List<Resource> selectByExample(ResourceExample example);

    ResourceWithBLOBs selectByPrimaryKey(Integer code);

    int updateByExampleSelective(@Param("record") ResourceWithBLOBs record, @Param("example") ResourceExample example);

    int updateByExampleWithBLOBs(@Param("record") ResourceWithBLOBs record, @Param("example") ResourceExample example);

    int updateByExample(@Param("record") Resource record, @Param("example") ResourceExample example);

    int updateByPrimaryKeySelective(ResourceWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ResourceWithBLOBs record);

    int updateByPrimaryKey(Resource record);
}
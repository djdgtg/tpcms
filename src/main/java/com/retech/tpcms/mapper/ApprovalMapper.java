package com.retech.tpcms.mapper;

import com.retech.tpcms.entity.Approval;
import com.retech.tpcms.entity.ApprovalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApprovalMapper {
    int countByExample(ApprovalExample example);

    int deleteByExample(ApprovalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Approval record);

    int insertSelective(Approval record);

    List<Approval> selectByExampleWithBLOBs(ApprovalExample example);

    List<Approval> selectByExample(ApprovalExample example);

    Approval selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Approval record, @Param("example") ApprovalExample example);

    int updateByExampleWithBLOBs(@Param("record") Approval record, @Param("example") ApprovalExample example);

    int updateByExample(@Param("record") Approval record, @Param("example") ApprovalExample example);

    int updateByPrimaryKeySelective(Approval record);

    int updateByPrimaryKeyWithBLOBs(Approval record);

    int updateByPrimaryKey(Approval record);
}
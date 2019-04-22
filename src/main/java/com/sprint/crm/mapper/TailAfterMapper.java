package com.sprint.crm.mapper;

import com.sprint.crm.pojo.TailAfter;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TailAfterMapper {





    int insertSelective(TailAfter record);


    TailAfter selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(TailAfter record);

}
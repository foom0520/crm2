package com.sprint.crm.service;

import com.sprint.crm.pojo.TailAfter;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TailAfterDao {





    int insertSelective(TailAfter record);


    TailAfter selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(TailAfter record);

}
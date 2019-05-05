package com.sprint.crm.mapper;

import com.sprint.crm.pojo.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {




    int insertSelective(User record);


    User selectByPrimaryKey(Integer userId);



    int updateByPrimaryKeySelective(User record);
    

    /**
     * 通过角色名查该角色的所有用户
     * @param 角色名
     * @return 用户集合
     */
    List<User> selectZiXunShis(String name);

}
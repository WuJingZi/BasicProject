package com.xiaoyao.sys;

import com.xiaoyao.hy.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OperatorDao {

    @Select("SELECT * FROM sys_operator")
    List<User> findAll();

    @Select("SELECT * FROM sys_operator WHERE soperatorname=#{soperatorname}")
    Operator findByOperatorName(String soperatorname);
}

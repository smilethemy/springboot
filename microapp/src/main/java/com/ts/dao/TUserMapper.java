package com.ts.dao;

import com.ts.pojo.TUser;

public interface TUserMapper {
    int deleteByPrimaryKey(String cId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(String cId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

	TUser getUserByName(String name);
}
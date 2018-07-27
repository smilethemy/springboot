package com.ts.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ts.dao.TUserMapper;
import com.ts.pojo.TUser;
import com.ts.service.TUserService;
@Service
public class TUserServiceImpl implements TUserService {
	private @Resource TUserMapper userMapper;
	@Override
	public TUser getUserByName(String name) {
		TUser user = userMapper.getUserByName(name);
		return user;
	}

}

package com.sohu.cache.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sohu.cache.entity.AppUser;

/**
 * 用户管理dao
 * @author leifu
 * @Time 2014年6月5日
 */
public interface AppUserDao {

	AppUser get(@Param("id") Long id);
	
	int save(AppUser user);
	
	int update(AppUser user);
	
	int delete(@Param("id") Long id);

	int updatePwd(@Param("id") Long id, @Param("password") String password);

	AppUser getByName(@Param("name") String name);

	AppUser getByEmail(@Param("email") String email);

    List<AppUser> getUserList(@Param("chName") String chName);

	List<AppUser> getAdminList();

    List<AppUser> getAllUser();

	List<AppUser> getLastUser();
}

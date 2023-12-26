package com.sohu.cache.web.service;

import java.util.List;

import com.sohu.cache.entity.AppUser;
import com.sohu.cache.web.enums.SuccessEnum;

/**
 * 用户管理service
 * @author leifu
 * @Date 2014年10月27日
 * @Time 上午9:57:47
 */
public interface UserService {

    /**
     * 通过id获取用户
     * @param userId
     * @return
     */
    AppUser get(Long userId);

    /**
     * 通过中文名获取用户
     * @param chName
     * @return
     */
    List<AppUser> getUserList(String chName);

    /**
     * 获取所有用户
     */
    List<AppUser> getAllUser();

    /**
     * 获取最新一个用户
     */
    List<AppUser> getLastUser();

    /**
     * 获取某个应用下的所有用户
     * @param appId
     * @return
     */
    List<AppUser> getByAppId(Long appId);

    /**
     * 获取需要报警的用户列表
     * @param appId
     * @return
     */
    public List<AppUser> getAlertByAppId(Long appId);

    /**
     * 通过域账户前缀获取用户
     * @param name
     * @return
     */
    AppUser getByName(String name);

    /**
     * 保存用户
     * @param appUser
     * @return
     */
    SuccessEnum save(AppUser appUser);

    /**
     * 更新用户
     * @param appUser
     * @return
     */
    SuccessEnum update(AppUser appUser);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    SuccessEnum delete(Long userId);

    /**
     * 重置密码
     * @param userId
     * @return
     */
    SuccessEnum resetPwd(Long userId);

    /**
     * 修改密码
     * @param userId
     * @param password
     * @return
     */
    SuccessEnum updatePwd(Long userId, String password);

    String getOfficerName(Long appId);

    String getOfficerName(String officer);

    /**
     * 获取某个应用下的所有负责人
     * @param officer
     * @return
     */
    List<AppUser> getOfficerUserByUserIds(String officer);

}

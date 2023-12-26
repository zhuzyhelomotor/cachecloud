package com.sohu.cache.entity;

import cn.com.servyou.ec.sdk.entity.Employee;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户信息
 * 
 * @author leifu
 */
@Data
@ApiModel
public class AppUser implements Serializable {

    private static final long serialVersionUID = 7425158151337667662L;

    /**
     * 自增id
     */
    @ApiModelProperty(value = "用户id",hidden = true)
    private Long id;

    /**
     * 用户名(英文，域账户)
     */
    @ApiModelProperty(value = "用户名(英文，域账户)",required = true)
    private String name;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 中文名
     */
    @ApiModelProperty(value = "中文名",required = true)
    private String chName;
    
    /**
     * 用户域账户邮箱
     */
    @ApiModelProperty(value = "用户域账户邮箱",required = true)
    private String email;

    /**
     * 用户手机
     */
    @ApiModelProperty(value = "用户手机",required = true)
    private String mobile;

    /**
     * 用户微信号
     */
    @ApiModelProperty(value = "用户微信号",required = true)
    private String weChat;

    /**
     * 用户类型(类型参考AppUserTypeEnum)
     */
    @ApiModelProperty(value = "用户类型",hidden = true)
    private int type;

    /**
     * 是否接收报警
     */
    @ApiModelProperty(value = "是否接收报警 0:不接收报警 1:接收报警",hidden = true)
    private int isAlert;

    /**
     * 公司名
     */
    @ApiModelProperty(value = "公司名")
    private String company;

    /**
     * 目的
     */
    @ApiModelProperty(value = "目的")
    private String purpose;

    /**
     * 注册时间
     */
    @ApiModelProperty(value = "注册时间")
    private Date registerTime;

    /**
     * 判断是否是从governor过来的，默认是否
     */
    private boolean fromGovernor = false;

    public static AppUser buildFrom(Long userId, String name, String chName, String email, String mobile, String weChat,
            Integer type) {
        AppUser appUser = new AppUser();
        appUser.setId(userId);
        appUser.setName(name);
        appUser.setChName(chName);
        appUser.setEmail(email);
        appUser.setMobile(mobile);
        appUser.setWeChat(weChat);
        appUser.setType(type);
        return appUser;
    }

    public static AppUser buildFrom(Long userId, String name, String chName, String email, String mobile, String weChat,
                                    Integer type,Integer isAlert) {
        AppUser appUser = new AppUser();
        appUser.setId(userId);
        appUser.setName(name);
        appUser.setChName(chName);
        appUser.setEmail(email);
        appUser.setMobile(mobile);
        appUser.setWeChat(weChat);
        appUser.setType(type);
        appUser.setIsAlert(isAlert);
        return appUser;
    }

    public static AppUser buildFrom(Long userId, String name, String chName, String email, String mobile, String weChat,
                                    Integer type,Integer isAlert, String company, String purpose) {
        AppUser appUser = new AppUser();
        appUser.setId(userId);
        appUser.setName(name);
        appUser.setChName(chName);
        appUser.setEmail(email);
        appUser.setMobile(mobile);
        appUser.setWeChat(weChat);
        appUser.setType(type);
        appUser.setIsAlert(isAlert);
        appUser.setCompany(company);
        appUser.setPurpose(purpose);
        return appUser;
    }

    public static AppUser buildFrom(Long userId, String name, String chName, String email, String mobile, String weChat,
                                    Integer type,Integer isAlert, String password, String company, String purpose) {
        AppUser appUser = new AppUser();
        appUser.setId(userId);
        appUser.setName(name);
        appUser.setChName(chName);
        appUser.setEmail(email);
        appUser.setMobile(mobile);
        appUser.setWeChat(weChat);
        appUser.setType(type);
        appUser.setIsAlert(isAlert);
        appUser.setPassword(password);
        appUser.setCompany(company);
        appUser.setPurpose(purpose);
        return appUser;
    }

    public AppUser() {
    }

    public AppUser(String name, String chName, String email, String mobile, String weChat, int type) {
        this.name = name;
        this.chName = chName;
        this.email = email;
        this.mobile = mobile;
        this.weChat = weChat;
        this.type = type;
    }

    public AppUser(String name, String chName, String email, String mobile, String weChat, int type, int isAlert) {
        this.name = name;
        this.chName = chName;
        this.email = email;
        this.mobile = mobile;
        this.weChat = weChat;
        this.type = type;
        this.isAlert = isAlert;
    }
}

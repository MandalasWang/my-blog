package com.my.blog.website.service;

import com.my.blog.website.model.Vo.UserVo;

/**
 * @author 博渊
 */
public interface IUserService {

    /**
     * 保存用户数据
     *
     * @param userVo 用户数据
     * @return 主键
     */

    Integer insertUser(UserVo userVo);

    /**
     * 通过uid查找对象
     * @param uid
     * @return
     */
    UserVo queryUserById(Integer uid);

    /**
     * 用戶登录
     * @param username
     * @param password
     * @return
     */
    UserVo login(String username, String password);

    /**
     * 根据主键更新user对象
     * @param userVo
     * @return
     */
    void updateByUid(UserVo userVo);

    /**
     * 通过username获取用户信息
     * @param userName
     * @return
     */
    UserVo getUserInfoByUsername(String userName);
}

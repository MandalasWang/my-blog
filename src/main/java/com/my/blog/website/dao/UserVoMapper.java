package com.my.blog.website.dao;

import com.my.blog.website.model.Vo.UserVo;
import com.my.blog.website.model.Vo.UserVoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author 博渊
 */
@Component
public interface UserVoMapper {
    /**
     * 获取用户个数
     * @param example
     * @return
     */
    long countByExample(UserVoExample example);

    /**
     * 根据用户删除
     * @param example
     * @return
     */
    int deleteByExample(UserVoExample example);

    /**
     * 根据id删除
     * @param uid
     * @return
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * 插入
     * @param record
     * @return
     */
    int insert(UserVo record);

    /**
     * 插入用户数据
     * @param record
     * @return
     */
    int insertSelective(UserVo record);

    /**
     * 获取列表
     * @param example
     * @return
     */
    List<UserVo> selectByExample(UserVoExample example);

    /**
     * 获取详情
     * @param uid
     * @return
     */
    UserVo selectByPrimaryKey(Integer uid);

    /**
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") UserVo record, @Param("example") UserVoExample example);

    /**
     *
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") UserVo record, @Param("example") UserVoExample example);

    /**
     * 更新用户数据
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(UserVo record);

    /**
     * 更新用户数据
     * @param record
     * @return
     */
    int updateByPrimaryKey(UserVo record);

    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    UserVo findByUsername(String username);

}
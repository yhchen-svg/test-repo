package com.lagou.dao;

import com.lagou.domain.*;

import java.util.List;

/*
* 用户模块的dao接口
* */
public interface UserMapper {
    /*
    * 分页获取用户数据&条件查询用户数据
    * */
    public List<User> findAllUserByPage(UserVo userVo);


    /*
    * 修改用户状态
    * */
    public void updateUserStatus(User user);


    /*
    * 用户登录功能
    * */
    public User login(User user);

    /*
    * 分配角色
    * */
    public void userContextRole(User_Role_relation user_role_relation);

    /*
    * 清除中间表的数据
    * */
    public void deleteUserRoleRelation(int id);

    /*
     * 1. 根据用户id查找角色信息
     * */
    public List<Role> findUserRelationRoleById(int id);

    /*
    * 2. 根据角色id查询角色所拥有的顶级菜单(-1)
    * ids:一个用户可能拥有多个角色
    * */
    public List<Menu> findParentMenuByRoleId(List<Integer> ids);

    /*
    * 3. 根据pid查询子菜单信息
    * */
    public List<Menu> findSubMenuByPid(Integer pid);

    /*
    * 4. 获取用户所拥有的资源信息
    * */
    public List<Resource> findResourceByRoleId(List<Integer> ids);
}

package com.lagou.dao;

import com.lagou.domain.Menu;
import com.lagou.domain.Role;
import com.lagou.domain.Role_menu_relation;

import java.util.List;

/*
* 角色dao层接口
* */
public interface RoleMapper {


    //角色列表查询&条件查询
    public List<Role> findAllRole(Role role);

    // 添加&修改角色
    public void saveRole(Role role);
    public void updateRole(Role role);

    // 根据角色ID查询关联菜单ID
    public List<String> findMenuByRoleId(int id);

    // 为角色分配菜单列表
    public void RoleContextMenu(Role_menu_relation role_menu_relation);

    // 当为角色分配菜单列表时，要将旧的列表删除（清空旧的中间表中的关系）
    public void deleteRoleRelation(Integer roleId);

    // 删除角色
    public void deleteRole(Integer id);
}

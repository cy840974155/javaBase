package com.cy.mapper;

import com.cy.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
//这个注解表示了这是一个mybatis的mapper类：

@Mapper
@Repository
public interface RoleMapper {
    public List<Role> queryRoleList();
    Role queryRoleById(int id);
    int addRole(Role role);
    int updateRole(Role role);
    int deleteRole(int id);
}

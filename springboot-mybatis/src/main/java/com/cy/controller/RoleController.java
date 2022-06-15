package com.cy.controller;

import com.cy.mapper.RoleMapper;
import com.cy.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    private RoleMapper roleMapper;
    @GetMapping("/queryList")
    public List<Role> queryRoleList(){
        List<Role> roleList= roleMapper.queryRoleList();
        for (Role role:roleList
             ) {
            System.out.println(role);
        }
        return roleList;
    }
    @RequestMapping(value = "/queryOneList",method = RequestMethod.GET)
    public Role queryRoleById(int id){
       Role role = roleMapper.queryRoleById(id);
        System.out.println(role);
       return role;
    }
}

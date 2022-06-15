package com.cy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    private int id;
    private String role_name;
    private int role_status;
    private int create_time;
    private int update_time;
    private String privileges_id;
}

package com.net.OnlineShoppingBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="rol_seq")
	@SequenceGenerator(name="rol_seq",sequenceName="rol_seq")
	private int roleId;
	private String rolename;
	private String role="ROLE_USER";
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}

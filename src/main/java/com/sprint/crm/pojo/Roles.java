package com.sprint.crm.pojo;

public class Roles {
    private Integer roleId;

    private String name;

	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roles(Integer roleId, String name) {
		super();
		this.roleId = roleId;
		this.name = name;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Roles [roleId=" + roleId + ", name=" + name + "]";
	}

    
}
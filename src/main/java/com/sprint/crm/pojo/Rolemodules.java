package com.sprint.crm.pojo;

public class Rolemodules {
    private Integer id;

    private Integer roleId;

    private Integer moduleId;

	public Rolemodules() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rolemodules(Integer id, Integer roleId, Integer moduleId) {
		super();
		this.id = id;
		this.roleId = roleId;
		this.moduleId = moduleId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	@Override
	public String toString() {
		return "Rolemodules [id=" + id + ", roleId=" + roleId + ", moduleId=" + moduleId + "]";
	}

   
}
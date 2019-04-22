package com.sprint.crm.pojo;

public class Modules {
    private Integer moduleId;

    private String name;

    private Integer parentId;

    private String path;

    private Integer weight;

	public Modules() {
		super();
	
	}

	public Modules(Integer moduleId, String name, Integer parentId, String path, Integer weight) {
		super();
		this.moduleId = moduleId;
		this.name = name;
		this.parentId = parentId;
		this.path = path;
		this.weight = weight;
	}

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Modules [moduleId=" + moduleId + ", name=" + name + ", parentId=" + parentId + ", path=" + path
				+ ", weight=" + weight + "]";
	}

   
}
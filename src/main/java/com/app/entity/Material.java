package com.app.entity;

import java.util.Date;

public class Material {

	private int MaterialId;
	private int menuId;
	private String materialName;
	private Date createTime;

	public int getMaterialId() {
		return MaterialId;
	}

	public void setMaterialId(int materialId) {
		MaterialId = materialId;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Material [MaterialId=" + MaterialId + ", menuId=" + menuId + ", materialName=" + materialName
				+ ", createTime=" + createTime + "]";
	}

}

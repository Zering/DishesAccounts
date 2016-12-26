package com.app.dto;

import java.util.List;

import com.app.entity.Material;
import com.app.entity.Menu;

public class MenuDetail {

	private Menu menu;
	private List<Material> materials;

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public List<Material> getMaterials() {
		return materials;
	}

	public void setMaterials(List<Material> materials) {
		this.materials = materials;
	}

	@Override
	public String toString() {
		return "MenuDetail [menu=" + menu + ", materials=" + materials + "]";
	}

}

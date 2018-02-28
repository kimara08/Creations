package Recipe.Creations;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the suggested_menus database table.
 * 
 */
@Entity
@Table(name="suggested_menus")
@NamedQuery(name="SuggestedMenus.findAll", query="SELECT s FROM SuggestedMenus s")
public class SuggestedMenus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="`﻿Suggested_Menu_id`")
	private String _Suggested_Menu_id;

	@Lob
	@Column(name="menu_description")
	private String menuDescription;

	private BigInteger menu_id;

	@Lob
	@Column(name="menu_name")
	private String menuName;

	@Column(name="menu_type_code")
	private BigInteger menuTypeCode;

	public SuggestedMenus() {
	}

	public String get_Suggested_Menu_id() {
		return this._Suggested_Menu_id;
	}

	public void set_Suggested_Menu_id(String _Suggested_Menu_id) {
		this._Suggested_Menu_id = _Suggested_Menu_id;
	}

	public String getMenuDescription() {
		return this.menuDescription;
	}

	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	}

	public BigInteger getMenu_id() {
		return this.menu_id;
	}

	public void setMenu_id(BigInteger menu_id) {
		this.menu_id = menu_id;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public BigInteger getMenuTypeCode() {
		return this.menuTypeCode;
	}

	public void setMenuTypeCode(BigInteger menuTypeCode) {
		this.menuTypeCode = menuTypeCode;
	}

}
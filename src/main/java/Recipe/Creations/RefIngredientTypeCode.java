package Recipe.Creations;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ref_ingredient_type_code database table.
 * 
 */
@Entity
@Table(name="ref_ingredient_type_code")
@NamedQuery(name="RefIngredientTypeCode.findAll", query="SELECT r FROM RefIngredientTypeCode r")
public class RefIngredientTypeCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="`﻿Ingredient_id`")
	private int _Ingredient_id;

	@Lob
	@Column(name="`Ingredient Aisle`")
	private String ingredient_Aisle;

	@Lob
	@Column(name="ingredient_type")
	private String ingredientType;

	private String menu_id;

	private int receipe_id;

	public RefIngredientTypeCode() {
	}

	public int get_Ingredient_id() {
		return this._Ingredient_id;
	}

	public void set_Ingredient_id(int _Ingredient_id) {
		this._Ingredient_id = _Ingredient_id;
	}

	public String getIngredient_Aisle() {
		return this.ingredient_Aisle;
	}

	public void setIngredient_Aisle(String ingredient_Aisle) {
		this.ingredient_Aisle = ingredient_Aisle;
	}

	public String getIngredientType() {
		return this.ingredientType;
	}

	public void setIngredientType(String ingredientType) {
		this.ingredientType = ingredientType;
	}

	public String getMenu_id() {
		return this.menu_id;
	}

	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}

	public int getReceipe_id() {
		return this.receipe_id;
	}

	public void setReceipe_id(int receipe_id) {
		this.receipe_id = receipe_id;
	}

}
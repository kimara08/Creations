package Recipe.Creations;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the course_recipe_choices database table.
 * 
 */
@Entity
@Table(name="course_recipe_choices")
@NamedQuery(name="CourseRecipeChoice.findAll", query="SELECT c FROM CourseRecipeChoice c")
public class CourseRecipeChoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int course_recipe_choices_id;

	@Lob
	private String course_Type;

	private String level_id;

	@Lob
	private String level_Type;

	@Column(name="`﻿menu_id`")
	private BigInteger _menuId;

	@Column(name="recipe_id")
	private BigInteger recipeId;

	public CourseRecipeChoice() {
	}

	public int getCourse_recipe_choices_id() {
		return this.course_recipe_choices_id;
	}

	public void setCourse_recipe_choices_id(int course_recipe_choices_id) {
		this.course_recipe_choices_id = course_recipe_choices_id;
	}

	public String getCourse_Type() {
		return this.course_Type;
	}

	public void setCourse_Type(String course_Type) {
		this.course_Type = course_Type;
	}

	public String getLevel_id() {
		return this.level_id;
	}

	public void setLevel_id(String level_id) {
		this.level_id = level_id;
	}

	public String getLevel_Type() {
		return this.level_Type;
	}

	public void setLevel_Type(String level_Type) {
		this.level_Type = level_Type;
	}

	public BigInteger get_menuId() {
		return this._menuId;
	}

	public void set_menuId(BigInteger _menuId) {
		this._menuId = _menuId;
	}

	public BigInteger getRecipeId() {
		return this.recipeId;
	}

	public void setRecipeId(BigInteger recipeId) {
		this.recipeId = recipeId;
	}

}
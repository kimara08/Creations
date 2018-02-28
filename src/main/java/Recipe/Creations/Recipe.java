package Recipe.Creations;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="recipes")
@NamedQuery(name="Recipe.findAll", query="SELECT r FROM Recipe r")
public class Recipe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	private String picture;

	private int prepTime;

	@Lob
	@Column(name="recipe_description")
	private String recipeDescription;
	
	@Id
	@Column(name="`﻿recipe_id`")
	private int _recipeId;

	@Lob
	@Column(name="recipe_name")
	private String recipeName;

	private int serving_Size;

	@Lob
	private String video;



	public Recipe() {
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getPrepTime() {
		return this.prepTime;
	}

	public void setPrepTime(int prepTime) {
		this.prepTime = prepTime;
	}

	public String getRecipeDescription() {
		return this.recipeDescription;
	}

	public void setRecipeDescription(String recipeDescription) {
		this.recipeDescription = recipeDescription;
	}

	public int get_recipeId() {
		return this._recipeId;
	}

	public void set_recipeId(int _recipeId) {
		this._recipeId = _recipeId;
	}

	public String getRecipeName() {
		return this.recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public int getServing_Size() {
		return this.serving_Size;
	}

	public void setServing_Size(int serving_Size) {
		this.serving_Size = serving_Size;
	}

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

}
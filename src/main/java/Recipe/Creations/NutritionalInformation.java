package Recipe.Creations;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nutritional_information database table.
 * 
 */
@Entity
@Table(name="nutritional_information")
@NamedQuery(name="NutritionalInformation.findAll", query="SELECT n FROM NutritionalInformation n")
public class NutritionalInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="`﻿Nutritional_information_id`")
	private int _Nutritional_information_id;

	@Lob
	private String iNutrition;

	private int menu_Course_id;

	private int receipe_id;

	public NutritionalInformation() {
	}

	public int get_Nutritional_information_id() {
		return this._Nutritional_information_id;
	}

	public void set_Nutritional_information_id(int _Nutritional_information_id) {
		this._Nutritional_information_id = _Nutritional_information_id;
	}

	public String getINutrition() {
		return this.iNutrition;
	}

	public void setINutrition(String iNutrition) {
		this.iNutrition = iNutrition;
	}

	public int getMenu_Course_id() {
		return this.menu_Course_id;
	}

	public void setMenu_Course_id(int menu_Course_id) {
		this.menu_Course_id = menu_Course_id;
	}

	public int getReceipe_id() {
		return this.receipe_id;
	}

	public void setReceipe_id(int receipe_id) {
		this.receipe_id = receipe_id;
	}

}
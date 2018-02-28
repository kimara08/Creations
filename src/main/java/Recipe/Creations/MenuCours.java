package Recipe.Creations;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.mapping.List;


/**
 * The persistent class for the menu_courses database table.
 * 
 */
@Entity
@Table(name="menu_courses")
@NamedQuery(name="MenuCours.findAll", query="SELECT m FROM MenuCours m")
public class MenuCours implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="`﻿Menu_Courses_id`")
	private int _Menu_Courses_id;

	@Lob
	private String course_Type;

	private int menu_id;

	//bi-directional many-to-one association to Recipe


	public MenuCours() {
	}

	public int get_Menu_Courses_id() {
		return this._Menu_Courses_id;
	}

	public void set_Menu_Courses_id(int _Menu_Courses_id) {
		this._Menu_Courses_id = _Menu_Courses_id;
	}

	public String getCourse_Type() {
		return this.course_Type;
	}

	public void setCourse_Type(String course_Type) {
		this.course_Type = course_Type;
	}

	public int getMenu_id() {
		return this.menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	



	
	

}
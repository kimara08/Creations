package Recipe.Creations;



import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="levels")
@NamedQuery(name="Level.findAll", query="SELECT l FROM Level l")
public class Level implements Serializable {
	private static final long serialVersionUID = 1L;

	private String course_Recipe_Choices_id;
	
	@Id
	@Column(name="`﻿Level_id`")
	private int blah;

	public int getBlah() {
		return blah;
	}

	public void setBlah(int blah) {
		this.blah = blah;
	}

	@Lob
	private String level_Type;

	private int menu_id;

	public Level() {
	}

	public String getCourse_Recipe_Choices_id() {
		return this.course_Recipe_Choices_id;
	}

	public void setCourse_Recipe_Choices_id(String course_Recipe_Choices_id) {
		this.course_Recipe_Choices_id = course_Recipe_Choices_id;
	}

//	
	public String getLevel_Type() {
		return this.level_Type;
	}

	public void setLevel_Type(String level_Type) {
		this.level_Type = level_Type;
	}

	public int getMenu_id() {
		return this.menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

}
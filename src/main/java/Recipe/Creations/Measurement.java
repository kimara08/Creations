package Recipe.Creations;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the measurements database table.
 * 
 */
@Entity
@Table(name="measurements")
@NamedQuery(name="Measurement.findAll", query="SELECT m FROM Measurement m")
public class Measurement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="`﻿Measurement_id`")
	private int _Measurement_id;

	private BigInteger amount;

	private int course_Recipe_id;

	private BigInteger ingredient_id;

	@Lob
	private String measurement_abb;

	@Lob
	private String measurement_type;

	public Measurement() {
	}

	public int get_Measurement_id() {
		return this._Measurement_id;
	}

	public void set_Measurement_id(int _Measurement_id) {
		this._Measurement_id = _Measurement_id;
	}

	public BigInteger getAmount() {
		return this.amount;
	}

	public void setAmount(BigInteger amount) {
		this.amount = amount;
	}

	public int getCourse_Recipe_id() {
		return this.course_Recipe_id;
	}

	public void setCourse_Recipe_id(int course_Recipe_id) {
		this.course_Recipe_id = course_Recipe_id;
	}

	public BigInteger getIngredient_id() {
		return this.ingredient_id;
	}

	public void setIngredient_id(BigInteger ingredient_id) {
		this.ingredient_id = ingredient_id;
	}

	public String getMeasurement_abb() {
		return this.measurement_abb;
	}

	public void setMeasurement_abb(String measurement_abb) {
		this.measurement_abb = measurement_abb;
	}

	public String getMeasurement_type() {
		return this.measurement_type;
	}

	public void setMeasurement_type(String measurement_type) {
		this.measurement_type = measurement_type;
	}

}
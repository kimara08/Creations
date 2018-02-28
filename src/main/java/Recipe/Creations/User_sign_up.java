package Recipe.Creations;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the `user sign-up` database table.
 * 
 */
@Entity
@Table(name="`user sign-up`")
@NamedQuery(name="User_sign_up.findAll", query="SELECT u FROM User_sign_up u")
public class User_sign_up implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	@Column(name="`Date of Birth`")
	private String date_of_Birth;

	@Lob
	private String email;

	@Lob
	@Column(name="`First Name`")
	private String first_Name;

	@Lob
	@Column(name="`Last Name`")
	private String last_Name;

	@Id
	private int login_id;

	@Lob
	@Column(name="`﻿Username`")
	private String _Username;

	public User_sign_up() {
	}

	public String getDate_of_Birth() {
		return this.date_of_Birth;
	}

	public void setDate_of_Birth(String date_of_Birth) {
		this.date_of_Birth = date_of_Birth;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_Name() {
		return this.first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return this.last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public int getLogin_id() {
		return this.login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	public String get_Username() {
		return this._Username;
	}

	public void set_Username(String _Username) {
		this._Username = _Username;
	}

}
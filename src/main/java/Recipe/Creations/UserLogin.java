package Recipe.Creations;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_login database table.
 * 
 */
@Entity
@Table(name="user_login")
@NamedQuery(name="UserLogin.findAll", query="SELECT u FROM UserLogin u")
public class UserLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int login_id;

	private String menu_id;

	private String password;

	private String recipe_id;

	public UserLogin() {
	}

	public int getLogin_id() {
		return this.login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	public String getMenu_id() {
		return this.menu_id;
	}

	public void setMenu_id(String menu_id) {
		this.menu_id = menu_id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRecipe_id() {
		return this.recipe_id;
	}

	public void setRecipe_id(String recipe_id) {
		this.recipe_id = recipe_id;
	}

}
package Menu;


import java.awt.MenuItem;

import org.springframework.beans.factory.annotation.Autowired;


import com.vaadin.data.Binder;
import com.vaadin.event.ShortcutAction;
import com.vaadin.server.FontAwesome;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

import Recipe.Creations.Level;




@SpringComponent
@UIScope
public class LevelEditor extends VerticalLayout {
	private final  LevelRepository repository;

	
	private Level aLevel;

	
	TextField checkInDt = new TextField("Check In Date");
	TextField earlyRegistrationDt = new TextField("Check In Date"); // use a calendar control
	

	TextField meal_type = new TextField("Type of Meal");
	TextField meal_price = new TextField("Meal Price");
	TextField Menu_id = new TextField("menu_id");
	TextField Level_Type = new TextField("Level_Type");

	/* Action buttons */
	Button save = new Button("Save", FontAwesome.SAVE);
	Button cancel = new Button("Cancel");
	Button delete = new Button("Delete", FontAwesome.TRASH_O);
	CssLayout actions = new CssLayout(save, cancel, delete);
	MenuBar menuBar = new MenuBar();
	Binder<Level> binder = new Binder<>(Level.class);
	 
	@Autowired
	public LevelEditor(LevelRepository repository) {
		this.repository = repository;
	 	 
		addComponents(Level_Type, Menu_id, actions);

		// Configure and style components
		setSpacing(true);
		actions.setStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
		save.setStyleName(ValoTheme.BUTTON_PRIMARY);
		save.setClickShortcut(ShortcutAction.KeyCode.ENTER);

		// wire action buttons to save, delete and reset
		
		cancel.addClickListener(e -> editLevel(aLevel));
		setVisible(false);
	}

	public interface ChangeHandler {

		void onChange();
	}

	public final void editLevel(Level c) {
		if (c == null) {
			setVisible(false);
			return;
		}
		final boolean persisted = c.getMenu_id() != 0;
		if (persisted) {
			// Find fresh entity for editing
			aLevel = repository.findOne((long)(c.getMenu_id()));
		}
		else {
			aLevel = c;
		}
		cancel.setVisible(persisted);

		// Bind eventTbl properties to similarly named fields
		// Could also use annotation or "manual binding" or programmatically
		// moving values from fields to entities before saving
		binder.setBean(aLevel);

		setVisible(true);

		// A hack to ensure the whole form is visible
		save.focus();
		// Select all text in firstName field automatically
		Level_Type.selectAll();
	}
	
	

	public void setChangeHandler(ChangeHandler h) {
		// ChangeHandler is notified when either save or delete
		// is clicked
		save.addClickListener(e -> h.onChange());
		delete.addClickListener(e -> h.onChange());
	}

}

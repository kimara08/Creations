package Menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import Recipe.Creations.Level;
import Recipe.Creations.Measurement;


@SpringUI
public class VaadinUI extends UI {

	private static final long serialVersionUID = 1L;

	private final LevelRepository repo;

	private final LevelEditor editor;
	
	
	final Grid<Level> grid;

	final TextField filter;

	private final Button addNewBtn;

	@Autowired
	public VaadinUI(LevelRepository repo, LevelEditor editor) {
		this.repo = repo;
		this.editor = editor;
		this.grid = new Grid<>(Level.class);
		this.filter = new TextField();
		this.addNewBtn = new Button("New Level Type", FontAwesome.PLUS);
	}

	@Override
	protected void init(VaadinRequest request) {
		// build layout
		HorizontalLayout actions = new HorizontalLayout(filter, addNewBtn);
		VerticalLayout mainLayout = new VerticalLayout(actions, grid, editor);
		setContent(mainLayout);

		grid.setHeight(300, Unit.PIXELS);
		grid.setColumns( "level_Type", "menu_id", "course_Recipe_Choices_id");

		filter.setPlaceholder("Filter by Level_id");

		// Hook logic to components

		// Replace listing with filtered content when user changes filter
		filter.setValueChangeMode(ValueChangeMode.LAZY);
		filter.addValueChangeListener(e -> listLevel(e.getValue()));

		// Connect selected Customer to editor or hide if none is selected
		grid.asSingleSelect().addValueChangeListener(e -> {
			editor.editLevel(e.getValue());
		});

		// Instantiate and edit new Customer the new button is clicked
		addNewBtn.addClickListener(e -> editor.editLevel(new Level()));

		// Listen changes made by the editor, refresh data from backend
		editor.setChangeHandler(() -> {
			editor.setVisible(false);
			listLevel(filter.getValue());
		});

		// Initialize listing
		listLevel(null);
	}
	MenuBar menuBar = new MenuBar();

	// tag::listCustomers[]
	void listLevel(String filterText) {
		if (StringUtils.isEmpty(filterText)) {
			grid.setItems(repo.findAll());
		}
		else {
		//	grid.setItems(repo.findByBlah(filterText));
		}
	}
	// end::listCustomers[]

}
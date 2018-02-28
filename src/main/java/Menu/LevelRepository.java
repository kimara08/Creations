package Menu;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import Recipe.Creations.Level;



public interface LevelRepository extends JpaRepository<Level, Long> {

	Collection<Level> findByBlah(String filterText);

	

	
	 
	

	

}



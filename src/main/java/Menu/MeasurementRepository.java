package Menu;

import org.springframework.data.jpa.repository.JpaRepository;

import Recipe.Creations.Measurement;

public interface MeasurementRepository extends JpaRepository<Measurement, Long> {

}

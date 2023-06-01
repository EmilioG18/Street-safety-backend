package streetsafety.com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import streetsafety.com.demo.entities.Delitos;

public interface IDelitosRepository extends JpaRepository<Delitos, Integer> {
}

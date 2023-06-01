package streetsafety.com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import streetsafety.com.demo.entities.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
}

package streetsafety.usuario.com.usuario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import streetsafety.usuario.com.usuario.entities.Usuario;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IURepository extends JpaRepository<Usuario,Integer> {
    @Query("from Usuario u where u.username=:username")
    List<Usuario> findByusername(@Param("username") String username);
}

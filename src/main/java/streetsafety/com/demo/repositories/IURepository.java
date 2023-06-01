package streetsafety.com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import streetsafety.com.demo.entities.Usuario;

import java.util.List;

@Repository
public interface IURepository extends JpaRepository<Usuario,Integer> {
    @Query("from Usuario u where u.username=:username")
    List<Usuario> findByusername(@Param("username") String username);
}

package streetsafety.usuario.com.usuario.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streetsafety.usuario.com.usuario.entities.Usuario;
import streetsafety.usuario.com.usuario.repositories.IURepository;
import streetsafety.usuario.com.usuario.services.IUService;

import java.util.List;

@Service
public class UServiceImplement implements IUService {
    @Autowired
    private IURepository uR;
    @Override
    public  void insert (Usuario usuario){
        uR.save(usuario);}
    @Override
    public List<Usuario> list(){return  uR.findAll();}
    @Override
    public void delete(int idU){uR .deleteById(idU);}
    @Override
    public  Usuario listId(int IdU){
        return  uR.findById(IdU).orElse(new Usuario());
    }

    @Override
    public List<Usuario> findByusername(String username) {
        return uR.findByusername(username);
    }

}

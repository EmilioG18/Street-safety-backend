package streetsafety.com.demo.servicesimplement;

import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streetsafety.com.demo.entities.Usuario;
import streetsafety.com.demo.repositories.IUsuarioRepository;
import streetsafety.com.demo.services.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Override
    public  void insert (Usuario usuario){ uR.save(usuario);}
    @Override
    public List<Usuario> list(){ return  uR.findAll();}

}

package streetsafety.com.demo.services;

import streetsafety.com.demo.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public  void insert(Usuario usuario);
    List<Usuario> list();
}

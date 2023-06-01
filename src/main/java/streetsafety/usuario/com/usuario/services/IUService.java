package streetsafety.usuario.com.usuario.services;

import streetsafety.usuario.com.usuario.entities.Usuario;

import java.util.List;

public interface IUService {
    public void insert (Usuario usuario);
    List<Usuario> list();
    public  void delete(int idU);
    public  Usuario listId(int IdU);
    List<Usuario>findByusername(String  username);
}

package streetsafety.com.demo.services;

import streetsafety.com.demo.entities.Delitos;

import java.util.List;

public interface IDelitosService {
    public void insert(Delitos delitos);
    List<Delitos> list();
}

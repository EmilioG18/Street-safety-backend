package streetsafety.com.demo.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streetsafety.com.demo.entities.Delitos;
import streetsafety.com.demo.repositories.IDelitosRepository;
import streetsafety.com.demo.services.IDelitosService;

import java.util.List;

@Service
public class DelitosServiceImplement implements IDelitosService {
    @Autowired
    private IDelitosRepository dR;

    @Override
    public void insert (Delitos delitos){ dR.save(delitos);}
    @Override
    public List<Delitos> list(){return dR.findAll();}
}

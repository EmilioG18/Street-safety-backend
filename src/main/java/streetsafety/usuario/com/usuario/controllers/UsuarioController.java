package streetsafety.usuario.com.usuario.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import streetsafety.usuario.com.usuario.dtos.UsuarioDTO;
import streetsafety.usuario.com.usuario.entities.Usuario;
import streetsafety.usuario.com.usuario.services.IUService;
import org.modelmapper.ModelMapper;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private IUService uS;

    @PostMapping
    public void insert(@RequestBody UsuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuario p = m.map(dto, Usuario.class);
        uS.insert(p);
    }

@GetMapping
public List<UsuarioDTO> list(){
    return uS.list().stream().map(x->{
    ModelMapper m =new ModelMapper();
   return  m.map(x,UsuarioDTO.class);
    }).collect(Collectors.toList());
}
@DeleteMapping("/{id}")
    public void  delete(@PathVariable("id")Integer id){ uS.delete(id);

}
    @GetMapping("/{id}")
    public UsuarioDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UsuarioDTO  dto = m.map(uS.listId(id), UsuarioDTO .class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuario p=m.map(dto,Usuario.class);
        uS.insert(p);
    }
    @PostMapping("/buscar")
    List<UsuarioDTO>search(@RequestBody String username){
        return uS.findByusername(username).stream().map(x->{
            ModelMapper m =new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

}

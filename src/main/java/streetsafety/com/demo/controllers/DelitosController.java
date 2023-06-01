package streetsafety.com.demo.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import streetsafety.com.demo.dtos.DelitosDTO;
import streetsafety.com.demo.entities.Delitos;
import streetsafety.com.demo.services.IDelitosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/delitos")
public class DelitosController {
    @Autowired
    private IDelitosService dS;
    @PostMapping
    public void insert(@RequestBody Delitos dto){
        ModelMapper m=new ModelMapper();
        Delitos d=m.map(dto, Delitos.class);
        dS.insert(d);
    }

    @GetMapping
    public List<DelitosDTO> list(){
        return dS.list().stream().map(x ->{
            ModelMapper m = new ModelMapper();
            return m.map(x, DelitosDTO.class);
        }).collect(Collectors.toList());
    }
}


package com.msUsuarios.controller;
import com.msUsuarios.dto.UsuariosDTO;
import com.msUsuarios.service.UsuariosService;

import java.util.List;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/usuarios")
public class UsuariosController {

    private final UsuariosService usuariosService;

    public UsuariosController(UsuariosService usuariosService){
        this.usuariosService = usuariosService;
    }
    
    @GetMapping
    public List<UsuariosDTO> lista(){
        return usuariosService.lista();
    } 
    
    @GetMapping("/{id}")
    public UsuariosDTO busquedaId(@PathVariable Long id) {
        return usuariosService.busquedaId(id);
    }

    @GetMapping("/buscar")
    public UsuariosDTO buscarName(@RequestParam String name) {
        return usuariosService.busquedaName(name);
    }

    @PostMapping
    public UsuariosDTO NuevoRegistro(@RequestBody UsuariosDTO usuarios) {
        return usuariosService.nuevoRegistro(usuarios);
    }

    @PutMapping("/{id}")
    public UsuariosDTO actualizarRegistro(@PathVariable Long id, @RequestBody UsuariosDTO usuarios) {
        return usuariosService.actualizarUsuario(id, usuarios);
    }

    @DeleteMapping("/{id}")
    public void eliminarRegistro(@PathVariable Long id) {
        usuariosService.eliminarRegistro(id);
    
    
}
}
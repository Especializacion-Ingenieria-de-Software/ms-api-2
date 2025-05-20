package com.msUsuarios.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.msUsuarios.dto.UsuariosDTO;

import java.util.List;

@FeignClient(name = "ms-api-usuarios") // name of ms registred in eureka
public interface UsuariosBDClient {
    
    @GetMapping("/usuarios")
    List<UsuariosDTO> todos();

    @GetMapping("/usuarios/{id}")
    UsuariosDTO busquedaId(@PathVariable Long id);

    @GetMapping("/usuarios/{name}")
    UsuariosDTO busquedaName(@RequestParam String name);

    @PostMapping("/usuarios")
    UsuariosDTO crearRegistro(@RequestBody UsuariosDTO usuarios);

    @PutMapping("/usuarios/{id}")
    UsuariosDTO actualizarRegistro(@PathVariable Long id, @RequestBody UsuariosDTO usuarios);

    @DeleteMapping("/usuario/{id}")
    void eliminarRegistro(@PathVariable Long id);
}


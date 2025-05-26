package com.msusuarios.client;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.msusuarios.dto.UsuariosDTO;
import com.msusuarios.request.UsuariosRequest;

import lombok.RequiredArgsConstructor;

import java.util.List;

@FeignClient(name = "ms-tareas") // name of ms registred in eureka
@EnableDiscoveryClient
public interface UsuariosBDClient {
    
    @GetMapping("/usuarios")
    List<UsuariosDTO> getUsers();

    @GetMapping("/usuarios/{id}")
    UsuariosDTO getUser(@PathVariable Long id);

    // @GetMapping("/usuarios/{name}")
    // UsuariosDTO busquedaName(@RequestParam String name);

    @PostMapping("/usuarios")
    UsuariosDTO createUser(@RequestBody UsuariosRequest request);

    @PutMapping("/usuarios/{id}")
    UsuariosDTO updateUser(@PathVariable Long id, @RequestBody UsuariosRequest request);

    @DeleteMapping("/usuarios/{id}")
    void deleteUser(@PathVariable Long id);
}


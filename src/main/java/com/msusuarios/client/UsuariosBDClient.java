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
    
    @GetMapping("/taskuser")
    List<UsuariosDTO> getUsers();

    @GetMapping("/taskuser/id/{id}")
    UsuariosDTO getUser(@PathVariable Long id);

    @GetMapping("/taskuser/name/{name}")
    UsuariosDTO getName(@RequestParam String name);

    @PostMapping("/taskuser")
    UsuariosDTO createUser(@RequestBody UsuariosRequest request);

    @PutMapping("/taskuser/{id}")
    UsuariosDTO updateUser(@PathVariable Long id, @RequestBody UsuariosRequest request);

    @DeleteMapping("/taskuser/{id}")
    void deleteUser(@PathVariable Long id);
}


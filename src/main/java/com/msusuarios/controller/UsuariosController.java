package com.msusuarios.controller;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.msusuarios.dto.UsuariosDTO;
import com.msusuarios.request.UsuariosRequest;
import com.msusuarios.service.UsuariosService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;


@RestController
public class UsuariosController {

    private final UsuariosService usuariosService;

    public UsuariosController(UsuariosService usuariosService){
        this.usuariosService = usuariosService;
    }
    
    @GetMapping("/usuarios")
    @Operation(summary = "Get all records")
    public List<UsuariosDTO> getUsers(){
        return usuariosService.getUsers();
    } 
    
    @GetMapping("/usuarios/{id}")
    @Operation(summary = "Show 1 record pro id")
    public UsuariosDTO getUser(@PathVariable Long id) {
        return usuariosService.getUser(id);
    }

    // @GetMapping("/usuarios/{name}")
    // @Operation(summary = "Show a pro name")
    // public UsuariosDTO buscarName(@RequestParam String name) {
    //     return usuariosService.busquedaName(name);
    // }

    @PostMapping("/usuarios")
    @Operation(summary = "Create a record")
    public UsuariosDTO createUser(@RequestBody UsuariosRequest request) {
        return usuariosService.createUser(request);
    }

    @PutMapping("/usuarios/{id}")
    @Operation(summary = "Update a record pro id")
    public UsuariosDTO updateUser(@PathVariable Long id, @RequestBody UsuariosRequest request) {

        UsuariosDTO usuariosDTO = usuariosService.updateUser(id, request);

        if (usuariosDTO != null){
            return usuariosService.updateUser(id, request);
        } else{
            return null;
        }

    }
        
    

    @DeleteMapping("/usuarios/{id}")
    @Operation(summary = "Delete a record pro id")
    public void deleteUser(@PathVariable Long id) {
        usuariosService.deleteUser(id);
    
    }
}
package com.msusuarios.service;
import org.springframework.stereotype.Service;

import com.msusuarios.client.UsuariosBDClient;
import com.msusuarios.dto.UsuariosDTO;
import com.msusuarios.request.UsuariosRequest;

import java.util.List;

@Service
public class UsuariosService {

    private final UsuariosBDClient bdClient;

    public UsuariosService(UsuariosBDClient bdClient){
        this.bdClient = bdClient;
    }

    public List<UsuariosDTO> getUsers(){
        return bdClient.getUsers();
    }

    public UsuariosDTO getUser(Long id){
        return bdClient.getUser(id);
    }

    public UsuariosDTO getName(String name){
        return bdClient.getName(name);
    }

    public UsuariosDTO createUser(UsuariosRequest request){
        return bdClient.createUser(request);
    }

    public UsuariosDTO updateUser(Long id, UsuariosRequest request){
        return bdClient.updateUser(id, request);
    }

    public void deleteUser(Long id){
        bdClient.deleteUser(id);
    }
}
    


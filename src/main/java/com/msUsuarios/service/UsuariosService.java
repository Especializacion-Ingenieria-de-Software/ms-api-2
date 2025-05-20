package com.msUsuarios.service;
import org.springframework.stereotype.Service;
import com.msUsuarios.dto.UsuariosDTO;
import com.msUsuarios.client.UsuariosBDClient;

import java.util.List;

@Service
public class UsuariosService {

    private final UsuariosBDClient bdClient;

    public UsuariosService(UsuariosBDClient bdClient){
        this.bdClient = bdClient;
    }

    public List<UsuariosDTO> lista(){
        return bdClient.todos();
    }

    public UsuariosDTO busquedaId(Long id){
        return bdClient.busquedaId(id);
    }

    public UsuariosDTO busquedaName(String name){
        return bdClient.busquedaName(name);
    }

    public UsuariosDTO nuevoRegistro(UsuariosDTO usuarios){
        return bdClient.crearRegistro(usuarios);
    }

    public UsuariosDTO actualizarUsuario(Long id, UsuariosDTO usuarios){
        return bdClient.actualizarRegistro(id, usuarios);
    }

    public void eliminarRegistro(Long id){
        bdClient.eliminarRegistro(id);
    }
}
    


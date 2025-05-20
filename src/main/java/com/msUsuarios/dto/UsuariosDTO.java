package com.msUsuarios.dto;

public class UsuariosDTO {
    private Long id;
    private String name;
    private String email;
    private Number mobile;

    public UsuariosDTO() {
    }

    public UsuariosDTO(Long id, String name, String email, Number mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    //Getters y Setters

    public long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public String getEmail(){ return email; }
    public void setEmail(String email){ this.email = email; }

    public Number getMobile(){ return mobile; }
    public void setEmail(Number mobile){ this.mobile = mobile; }
}

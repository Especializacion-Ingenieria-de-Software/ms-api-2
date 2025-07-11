package com.msusuarios.dto;

public class UsuariosDTO {
    private Long id;
    private String name;
    private String email;
    private String mobile;

    public UsuariosDTO() {
    }

    public UsuariosDTO(Long id, String name, String email, String mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    //Getters and Setters
    public long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public String getEmail(){ return email; }
    public void setEmail(String email){ this.email = email; }

    public String getMobile(){ return mobile; }
    public void setMobile(String mobile){ this.mobile = mobile; }
}

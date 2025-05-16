package com.ms_api_1.dto;

public class ItemDTO {
    private Long id;
    private String name;
    private String type;

    public ItemDTO() {
    }

    public ItemDTO(Long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
}

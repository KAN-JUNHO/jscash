package com.example.jcash.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberMapperDTO {
    private Long seq;
    private String name;
    private String email;

    public MemberMapperDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

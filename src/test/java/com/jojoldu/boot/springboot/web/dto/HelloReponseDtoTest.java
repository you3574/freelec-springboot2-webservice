package com.jojoldu.boot.springboot.web.dto;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloReponseDtoTest{


    public void lombok_Test() {
        String name="yoobin";
        int amount=1000;

        HelloReponseDto dto=new HelloReponseDto(name,amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}
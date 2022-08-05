package com.webflux.demo.webflux_demo.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Response {
    private Date date;
    private int output;

    public Response(int output) {
        this.output = output;
    }
}

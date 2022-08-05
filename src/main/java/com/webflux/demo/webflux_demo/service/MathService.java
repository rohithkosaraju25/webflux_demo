package com.webflux.demo.webflux_demo.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.webflux.demo.webflux_demo.dto.Response;

@Service
public class MathService {
    public Response findSquare(int input) {
        return new Response(input * input);
    }

    public List<Response> multiplicationTable(int input) {
        List<Response> response = IntStream.rangeClosed(1, 10)
                .peek(i -> SleepUtil.sleepSeconds(1))
                .peek(i -> System.out.println("math-service processing: " + i))
                .mapToObj(i -> new Response(i * input))
                .collect(Collectors.toList());
        System.out.println(response);
        return response;
    }

}

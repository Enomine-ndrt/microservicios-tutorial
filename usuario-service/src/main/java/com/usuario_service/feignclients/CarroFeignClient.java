package com.usuario_service.feignclients;

import com.usuario_service.modelos.Carro;
import com.usuario_service.modelos.Moto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "carro-service", path = "/carro")
public interface CarroFeignClient {

    @PostMapping
    public Carro save(@RequestBody Carro carro);

    @GetMapping("/usuario/{usuarioId}")
    public List<Carro> getCarros(@PathVariable("usuarioId")int usuarioId);

}

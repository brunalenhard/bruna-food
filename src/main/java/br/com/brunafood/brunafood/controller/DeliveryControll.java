package br.com.brunafood.brunafood.controller;

import br.com.brunafood.brunafood.domain.Delivery;
import br.com.brunafood.brunafood.service.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/deliverys")
@RequiredArgsConstructor
public class DeliveryControll {
    private final DeliveryService deliveryService;

    public Delivery save(@RequestBody Delivery delivery){
        return deliveryService.save(delivery);
    }
}

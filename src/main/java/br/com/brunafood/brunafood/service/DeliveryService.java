package br.com.brunafood.brunafood.service;

import br.com.brunafood.brunafood.domain.Delivery;
import br.com.brunafood.brunafood.exception.EntityNotFoundException;
import br.com.brunafood.brunafood.repository.DeliveryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeliveryService {
    private final DeliveryRepository deliveryRepository;

    public Delivery save(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

}


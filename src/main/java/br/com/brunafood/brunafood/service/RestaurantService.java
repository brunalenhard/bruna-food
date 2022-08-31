package br.com.brunafood.brunafood.service;

import br.com.brunafood.brunafood.domain.Restaurant;
import br.com.brunafood.brunafood.exception.EntityNotFoundException;
import br.com.brunafood.brunafood.repository.RestaurantRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    public Restaurant save(Restaurant restaurant) {
        Restaurant savedRestaurant = restaurantRepository.save(restaurant);
        log.info("persistindo restaurante {}", savedRestaurant);
        return savedRestaurant;
    }

    public Restaurant findById(Long id) {
        return restaurantRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Restaurante nao encontrado"));
    }

    public Restaurant update(Restaurant restaurant) {
        if (!restaurantRepository.existsById(restaurant.getId())) {
            throw new EntityNotFoundException("Restaurante nao encontrado");
        }
        return restaurantRepository.save(restaurant);
    }

}

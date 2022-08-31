package br.com.brunafood.brunafood.controller;

import br.com.brunafood.brunafood.domain.Restaurant;
import br.com.brunafood.brunafood.mapper.RestaurantMapper;
import br.com.brunafood.brunafood.repository.RestaurantRepository;
import br.com.brunafood.brunafood.requests.RestaurantRequest;
import br.com.brunafood.brunafood.response.RestaurantResponse;
import br.com.brunafood.brunafood.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/restaurants")
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantService restaurantService;
    private final RestaurantMapper restaurantMapper;

    @PostMapping
    public RestaurantResponse save(@RequestBody RestaurantRequest restaurantRequest) {
        Restaurant restaurantToBeSaved = restaurantMapper.fromRestaurantRequestToRestaurant(restaurantRequest);
        Restaurant savedRestaurant = restaurantService.save(restaurantToBeSaved);
        return restaurantMapper.fromRestaurantToRestaurantResponse(savedRestaurant);
    }

    @PutMapping(path = "/{id}")
    public Restaurant update(@PathVariable Long id, @RequestBody Restaurant restaurant) {
        restaurant.setId(id);
        return restaurantService.update(restaurant);
    }

}

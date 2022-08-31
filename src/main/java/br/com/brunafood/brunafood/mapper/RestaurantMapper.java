package br.com.brunafood.brunafood.mapper;

import br.com.brunafood.brunafood.domain.Restaurant;
import br.com.brunafood.brunafood.requests.RestaurantRequest;
import br.com.brunafood.brunafood.response.RestaurantResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {
    @Mapping(source = "userId", target = "user.id")
    Restaurant fromRestaurantRequestToRestaurant(RestaurantRequest restaurantRequest);
    RestaurantResponse fromRestaurantToRestaurantResponse(Restaurant restaurant);




}

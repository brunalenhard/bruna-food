package br.com.brunafood.brunafood.mapper;

import br.com.brunafood.brunafood.domain.Item;
import br.com.brunafood.brunafood.domain.Restaurant;
import br.com.brunafood.brunafood.requests.ItemRequest;
import br.com.brunafood.brunafood.requests.RestaurantRequest;
import br.com.brunafood.brunafood.response.ItemResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    @Mapping(source = "restaurantId", target = "restaurant.id")
    @Mapping(source = "userId", target="restaurant.user.id")
    Item fromItemRequestToItem(ItemRequest itemRequest);

    ItemResponse fromItemToItemResponse(Item item);
}

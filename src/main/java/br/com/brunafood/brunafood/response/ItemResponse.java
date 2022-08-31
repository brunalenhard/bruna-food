package br.com.brunafood.brunafood.response;

import br.com.brunafood.brunafood.domain.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemResponse {
    private String name;
    private BigDecimal price;
    private RestaurantResponse restaurantResponse;
}

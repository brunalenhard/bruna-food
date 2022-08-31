package br.com.brunafood.brunafood.requests;

import br.com.brunafood.brunafood.domain.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemRequest {
    private String name;
    private BigDecimal price;
    private Long restaurantId;
    private Long userId;
}

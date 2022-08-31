package br.com.brunafood.brunafood.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantResponse {
    private String name;
    private Long userId;
    private String adressId;
}

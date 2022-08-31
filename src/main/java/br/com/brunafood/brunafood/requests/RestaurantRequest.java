package br.com.brunafood.brunafood.requests;

import br.com.brunafood.brunafood.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mapstruct.Mapper;

@Mapper
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantRequest {
   private String name;
   private Long userId;
   private String adressId;
}

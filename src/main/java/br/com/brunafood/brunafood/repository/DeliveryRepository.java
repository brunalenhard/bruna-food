package br.com.brunafood.brunafood.repository;

import br.com.brunafood.brunafood.domain.Delivery;
import br.com.brunafood.brunafood.service.DeliveryService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery, Long> {
}

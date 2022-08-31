package br.com.brunafood.brunafood.repository;

import br.com.brunafood.brunafood.domain.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>{

}

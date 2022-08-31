package br.com.brunafood.brunafood.service;

import br.com.brunafood.brunafood.domain.Item;
import br.com.brunafood.brunafood.exception.EntityNotFoundException;
import br.com.brunafood.brunafood.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
@Log4j2
@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public Item save(Item item){
        Item savedItem = itemRepository.save(item);
        log.info(savedItem);
        return savedItem;
    }
    public Item update(Item item){
        if(!itemRepository.existsById(item.getId())){
            throw new EntityNotFoundException("Item nao encontrado");
        }
        return itemRepository.save(item);
    }
}

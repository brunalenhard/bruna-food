package br.com.brunafood.brunafood.controller;

import br.com.brunafood.brunafood.domain.Item;
import br.com.brunafood.brunafood.mapper.ItemMapper;
import br.com.brunafood.brunafood.requests.ItemRequest;
import br.com.brunafood.brunafood.response.ItemResponse;
import br.com.brunafood.brunafood.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/items")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;
    private final ItemMapper itemMapper;

    @PostMapping
    public ItemResponse save(@RequestBody ItemRequest itemRequest) {
        Item itemToBeSaved = itemMapper.fromItemRequestToItem(itemRequest);
        Item savedItem = itemService.save(itemToBeSaved);
        return itemMapper.fromItemToItemResponse(savedItem);
    }

    @PutMapping(path = "/{id}")
    public Item update(@PathVariable Long id, @RequestBody Item item) {
        return itemService.update(item);
    }
}

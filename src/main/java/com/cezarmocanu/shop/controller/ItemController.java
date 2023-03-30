package com.cezarmocanu.shop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.cezarmocanu.shop.dto.CreateItemDTO;
import com.cezarmocanu.shop.mappers.ItemMapper;
import com.cezarmocanu.shop.model.Item;
import com.cezarmocanu.shop.repository.ItemRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/v1/items")
@AllArgsConstructor
public class ItemController {

    private ItemRepository itemRepository;
    private ItemMapper itemMapper;

    @GetMapping
    public ResponseEntity<List<Item>> getAll() {
        List<Item> items = itemRepository.findAll();
        return ResponseEntity.ok(items);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getById(@PathVariable Long id) {
        Optional<Item> item = itemRepository.findById(id);

        if (!item.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.ok(item.get());
    }

    @PostMapping
    public ResponseEntity<Item> createOne(@RequestBody CreateItemDTO itemDTO) {
        Item savedItem = itemRepository.save(itemMapper.fromCreateDTO(itemDTO));
        return ResponseEntity.ok(savedItem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteOne(@PathVariable Long id) {
        Optional<Item> item = itemRepository.findById(id);

        if (!item.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        itemRepository.delete(item.get());
        return ResponseEntity.ok().build();
    }
}

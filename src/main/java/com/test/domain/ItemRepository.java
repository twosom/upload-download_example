package com.test.domain;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * DataBase를 사용하는 것 대신 Map을 사용하여 MemoryDB 처럼 활용.
 */
@Repository
public class ItemRepository {

    private final Map<Long, Item> store = new HashMap<>();
    private AtomicLong sequence = new AtomicLong(0);

    public Item save(Item item) {
        item.setId(sequence.addAndGet(1));
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id) {
        return store.get(id);
    }





}

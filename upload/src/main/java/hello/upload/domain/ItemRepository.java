package hello.upload.domain;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ItemRepository {
    
    private final Map<Long, Item> store = new HashMap<Long, Item>();
    private long nextId = 0;
    
    public Item save(Item item) {
        item.setId(nextId++);
        store.put(item.getId(), item);
        return item;
    }
    
    public Item findById(long id) {
        return store.get(id);
    }
}

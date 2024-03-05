package com.example.ClothingStore;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/")
@CrossOrigin
public class StoreController {
    @Autowired
    private final StoreService storeService;
    public StoreController(StoreService storeService){
        this.storeService=storeService;
    }
    @GetMapping("/")
    public List<Store>getAll(){
        return storeService.getAllItems();
    }

    @PostMapping("/")
    public void addItem(@RequestBody Store store){
        storeService.addItem(store);
    }

    @PutMapping("/{id}")
    public void updateItem(@RequestBody Store store, @PathVariable Integer id){
        storeService.updateItem(store);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Integer id){
        storeService.deleteItem(id);
    }

    
    
}

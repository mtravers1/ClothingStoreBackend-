package com.example.ClothingStore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class StoreService {
    List<Store> s= new ArrayList<>();

    // @Autowired
    // private final StoreRepository storeRepository;

    // public StoreService(StoreRepository storeRepository){
    //     this.storeRepository=storeRepository;
    // }
    

    public List<Store>getAllItems(){
        return s;
    }

    public void addItem(Store store){
        s.add(store);
    }

    public void updateItem(Store store){
        s.removeIf(c->c.getId().equals(store.getId()));
        s.add(store);
    }

    public void deleteItem(Integer id){
        s.removeIf(c->c.getId().equals(id));

    }

    @PostConstruct
    public void init(){
        Store item= new Store(1, "Xbox", "Videogames", "Brandnew", 500.00,  "No Photos", "Black");

        s.add(item);
    }
}


// public Store(Integer id, String name, String category, String description, Double price, String photos, String color){
//     this.id=id;
//     this.name=name;
//     this.category=category;
//     this.description=description;
//     this.price=price;
//     this.photos=photos;
//     this.color=color;
// }
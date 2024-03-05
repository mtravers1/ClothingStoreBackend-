package com.example.ClothingStore;

public class Store {
    private Integer id;
    private String name;
    private String category;
    private String description;
    private String photos;
    private Double price;
    private String color;

    public Store(Integer id, String name, String category, String description, Double price, String photos, String color){
        this.id=id;
        this.name=name;
        this.category=category;
        this.description=description;
        this.price=price;
        this.photos=photos;
        this.color=color;
    }

    public void setId(Integer id){
        this.id=id;
    }   

    public Integer getId(){
        return id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setCategory(String category){
        this.category=category;
    }

    public String getCategory(){
        return category;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getDescription(){
        return description;
    }

    public void setPrice(Double price){
        this.price=price;
    }

    public Double getPrice(){
        return price;
    }

    public void setPhotos(String photos){
        this.photos=photos;
    }

    public String getPhotos(){
        return photos;
    }

    public void setColor(String color){
        this.color=color;
    }
    
    public String getColor(){
        return color;
    }

}

package com.java.POJO;

import javax.persistence.*;

@Entity
@Table(name="orderedList")
public class OrderedList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id",unique = true,nullable = false)
    private int id;
    @Column(name ="position")
    private int position;
    @Column(name = "items")
    private String items;

    @ManyToOne
    private Recipe recipe;


    public OrderedList(Recipe recipe) {
        this.recipe = recipe;
    }

    public OrderedList(){

    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

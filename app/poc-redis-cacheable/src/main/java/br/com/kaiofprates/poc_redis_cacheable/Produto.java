package br.com.kaiofprates.poc_redis_cacheable;

import java.io.Serializable;

public class Produto implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for Serializable classes

    private Long id;
    private String name;
    private Double price;

    public Produto(String id) {
        this.id = Long.valueOf(id);
        this.name = "Produto " + id;
        this.price = Math.random() * 100; // Random price for demonstration
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
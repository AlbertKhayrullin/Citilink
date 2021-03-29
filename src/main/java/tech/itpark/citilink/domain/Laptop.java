package tech.itpark.citilink.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Laptop extends Product {
    private String model;
    private String processor;

    public Laptop(long id, String name, int price, String model, String processor) {
        super(id, name, price);
        this.model = model;
        this.processor = processor;
    }
}

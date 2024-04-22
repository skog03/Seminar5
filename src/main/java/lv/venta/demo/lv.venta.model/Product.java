package lv.venta.demo.lv.venta.model;

import org.springframework.stereotype.Repository;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
//@RequiredArgsConstructor
@ToString
public class Product {
    @Setter(value=AccessLevel.NONE)
    private int id;
    private String title;
    private String description;
    private float price;
    private int quantity;

    private static int counter = 0;

    public void setId(){
        this.id = counter++;
    }
    public Product(String title, String description, float price, int quality){
        setId();
        setTitle(title);
        setDescription(description);
        setPrice(price);
        setQuantity(quality);
    }
}   


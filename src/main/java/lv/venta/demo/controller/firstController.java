package lv.venta.demo.controller;


import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lv.venta.demo.lv.venta.model.Product;





@Controller
public class firstController 
{

    @GetMapping("/hello")    //localhost:8080/hello
    public String getHello() {
        System.out.println("The first controller is working!!");
        return "hello-page";  //will show hello-page.html file in the browser
    }

    Random rand = new Random();
    @GetMapping("/hello/msg")   //localhost:8080/hello/msg
    public String getHelloMsg(Model model) {
        System.out.println("Second controller is working");
        model.addAttribute("mypackage", "Hello from JAVA: " + rand.nextInt(0, 100));
        return "hello-msg-page"; //will show hello-msg-page.html file in browser
    }

    @GetMapping("/product/test") //localhost:8080/product/test
    public String getProduceTest(Model model) {
        System.out.println("Third controller is working");
        Product p = new Product("Apple", "red", 0.99f, 4);
        model.addAttribute("mypackage", p);
        return "show-one-product-page"; //will show hello-msg-page.html file in browser
    }
    
    
    
}

//TODO
//create git repo and push
//create model package as lv.venta.model
//create new model class Product in this package (id, title, description, price, quantity)
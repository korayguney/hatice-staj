package com.roof.haticestaj;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    private List<String> stringList = new ArrayList<>();

    // read (select)
    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name;
    }

    // create (insert)
    @PostMapping("/hello")
    public List<String> sayHelloStr(@RequestParam String name) {
        stringList.add("Hello " + name);
        return stringList;
    }

    // delete from
    @DeleteMapping("/hello")
    public List<String> deleteFromHello(@RequestParam String name) {
        stringList.remove("Hello " + name);
        return stringList;
    }

}

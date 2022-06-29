package com.example.helloweb;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

//@Component
@RestController
public class HelloController {

    // GET http://localhost:8080/hello?firstname=Thorsten
    // @GetMapping("/hello")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld(@RequestParam(value = "firstname", required = false, defaultValue = "World") String name) {
        return "Hello " + name;
    }

    // GET http://localhost:8080/hello/Thorsten
    @GetMapping("/hello/{firstname}")
    public String helloWorldPath(@PathVariable("firstname") String name) {
        return "Hello " + name;
    }

    @GetMapping(value = "/helloUser", produces = "application/json")
    public User helloUser() {
        return new User("Thorsten");
    }

    @PostMapping(value = "/echoUser", produces = "application/json")
    public HttpEntity<User> echoUser(@RequestBody @Valid User user) {
        user.setName(user.getName() + "!!!");
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body(user);
    }
}

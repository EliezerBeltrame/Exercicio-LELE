package com.example.aula7;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private List<User> users = new ArrayList<>();
@PostMapping
    public User createUser(@RequestBody User newUser){
        users.add(newUser);
        return newUser;
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
    return users.stream()
            .filter(user -> user.getId() == id)
            .findFirst()
            .orElseThrow(() -> new RuntimeException("usuário não encontrado"));
    }
    @GetMapping
    public List<User> getUser(){
        return users;
    }

    // Example PUT endpoint
    @PutMapping("/update/{id}")
    @PathVariable(

    )
    public String updateItem(
            @ApiParam(value = "ID of the item to be updated", required = true) @PathVariable Long id,
            @ApiParam(value = "Updated item information", required = true) @RequestBody Item item
    ) {
        // Your update logic here
        return "Item with ID " + id + " updated successfully!";
    }
}

}

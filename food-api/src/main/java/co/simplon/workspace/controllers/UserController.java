package co.simplon.workspace.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.workspace.dtos.UserCreate;
import co.simplon.workspace.dtos.UserLogin;
import co.simplon.workspace.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
	this.service = service;

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody UserCreate inputs) {
	service.create(inputs);

    }

    @PostMapping("/sign-in")
    public Object signIn(@RequestBody UserLogin inputs)

    {
	return service.signIn(inputs);
    }

}

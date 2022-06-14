package co.simplon.ifeelsofood.services;

import co.simplon.ifeelsofood.dtos.UserCreate;
import co.simplon.ifeelsofood.dtos.UserLogin;
import co.simplon.ifeelsofood.security.Jwt;

public interface UserService {

    void create(UserCreate inputs);

    Jwt signIn(UserLogin inputs);

}

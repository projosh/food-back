package co.simplon.workspace.services;

import co.simplon.workspace.dtos.UserCreate;
import co.simplon.workspace.dtos.UserLogin;
import co.simplon.workspace.security.Jwt;

public interface UserService {

    void create(UserCreate inputs);

    Jwt signIn(UserLogin inputs);

}

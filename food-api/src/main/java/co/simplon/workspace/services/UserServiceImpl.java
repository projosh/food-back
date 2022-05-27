package co.simplon.workspace.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import co.simplon.workspace.dtos.UserCreate;
import co.simplon.workspace.dtos.UserLogin;
import co.simplon.workspace.entities.Role;
import co.simplon.workspace.entities.User;
import co.simplon.workspace.repositories.UserRepository;
import co.simplon.workspace.security.Jwt;
import co.simplon.workspace.security.JwtProvider;

@Service

public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final PasswordEncoder encoder;

    private final JwtProvider provider;

    public UserServiceImpl(UserRepository repository, PasswordEncoder encoder, JwtProvider provider) {
	this.repository = repository;
	this.encoder = encoder;
	this.provider = provider;

    }

    @Transactional
    @Override
    public void create(UserCreate inputs) {
	User user = new User();
	user.setUsername(inputs.getUsername());
	String encoded = encoder.encode(inputs.getPassword());
	user.setPassword(encoded);
	repository.save(user);

    }

    @Override
    public Jwt signIn(UserLogin inputs) throws BadCredentialsException {
	String username = inputs.getUsername();
	User user = repository.findByUsernameIgnoreCase(username).orElseThrow(
		() -> new BadCredentialsException(String.format("no user found with username '%s", username)));
	String password = inputs.getPassword();
	if (!encoder.matches(password, user.getPassword())) {
	    throw new BadCredentialsException(String.format("password does not matches '%s", username));
	}
	Role role = user.getRole();
	List<String> roles = null;
	if (role != null) {
	    roles = List.of(role.getName());

	}
	return provider.create(String.valueOf(user.getId()), roles);
    }

}

package appdelivery.demo.security.autentificacao;

import appdelivery.demo.security.usuario.Role;
import appdelivery.demo.security.usuario.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutentService {
    private final List<User> users = new ArrayList<>();

    public String register(RegistroRequest request){
        User user = new User();
        user.setUsername(request.getUserName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setRole(request.getRole());

        users.add(user);

        return "Usuario registrado com sucesso!";
    }

    public List<User> getAllUsers(){
        return users;
    }
}

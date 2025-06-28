package appdelivery.demo.security.autentificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AutentController {

    @Autowired
    private AutentService autentService;

    @PostMapping("register")
    public String register(@RequestBody RegistroRequest request){
        return autentService.register(request);
    }

    //end point futuro para login
}

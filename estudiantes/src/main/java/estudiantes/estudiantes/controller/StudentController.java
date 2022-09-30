package estudiantes.estudiantes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class StudentController {
@RequestMapping("/")
    public String principal() {
        return "home";
}
@RequestMapping("/login")
    public String login() {
        return "login";
    }
@RequestMapping("/nosotros")
    public String nosotros() {
        return "nosotros";
    }

@RequestMapping("/pagos")
    public String pagos() {
        return "pagos";
    }
@RequestMapping("/contacto")
    public String contacto() {
        return "contact";
    }
}

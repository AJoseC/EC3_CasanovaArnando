package DAW2.CL2.controller.frontoffice;

import DAW2.CL2.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class CambiarPasswordController {
    private UsuarioService usuarioService;

    @GetMapping("/CambiarPassword")
    public String CambiarPassword(Model model)
}

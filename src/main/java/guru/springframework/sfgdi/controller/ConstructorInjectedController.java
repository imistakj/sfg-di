package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingServices greetingServices;
    //Optional Autowired
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting() {
        return greetingServices.sayGreeting();
    }
}

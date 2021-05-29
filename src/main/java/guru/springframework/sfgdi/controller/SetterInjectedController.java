package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingServices greetingServices;

    @Autowired
    public void setGreetingServices(@Qualifier("setterInjectorGreetingService") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting() {
      return greetingServices.sayGreeting();
    }
}

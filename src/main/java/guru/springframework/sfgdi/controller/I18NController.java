package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {
    private final GreetingServices greetingServices;

    public I18NController(@Qualifier("i18nService") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting() {
        return greetingServices.sayGreeting();
    }
}

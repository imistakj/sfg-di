package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectorGreetingService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hello From Setter Service";
    }
}

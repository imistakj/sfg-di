package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectorGreetingService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hello from property";
    }
}

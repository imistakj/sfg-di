package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

public class ConstructorGreetingService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hello from Constructor service";
    }
}

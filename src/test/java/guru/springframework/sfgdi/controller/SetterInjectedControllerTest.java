package guru.springframework.sfgdi.controller;

import guru.springframework.sfgdi.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void SetUp() {
     controller = new SetterInjectedController();
     controller.setGreetingServices(new GreetingServicesImpl());
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }
}
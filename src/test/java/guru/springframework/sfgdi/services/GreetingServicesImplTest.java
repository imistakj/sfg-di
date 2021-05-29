package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.controller.PropertyInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServicesImplTest {

    PropertyInjectedController  controller;


    @BeforeEach
    void setUp() {
         controller = new PropertyInjectedController();
         controller.greetingServices = new GreetingServicesImpl();

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }


}
package guru.springframework.sfgdi.beans;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    SingletonBean() {
        System.out.println("Singleton bean has been created !!!!!!!!!!!");
    }

    public String getScope() {
        return "I am a Singleton bean!!!!";
    }
}

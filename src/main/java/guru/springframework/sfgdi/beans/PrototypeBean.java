package guru.springframework.sfgdi.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean {
    PrototypeBean() {
        System.out.println("Prototype bean is created !!!!!!!!!!");
    }

    public String getScope() {
        return "I am prototype bean ";
    }
}

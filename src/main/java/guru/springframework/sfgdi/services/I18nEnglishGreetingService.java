package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hey Howe are you!!!!";
    }
}

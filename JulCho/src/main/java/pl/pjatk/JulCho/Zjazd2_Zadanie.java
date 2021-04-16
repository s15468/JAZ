package pl.pjatk.JulCho;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="my.custom.boolProperty", havingValue = "true", matchIfMissing = false)
public class Zjazd2_Zadanie
{
    public Zjazd2_Zadanie(String testPropertyValue)
    {
        System.out.println("Hello from Zadanie_Zjazd2");
        System.out.println(testPropertyValue);
        System.out.println("BoolProperty is set to TRUE");
    }
}

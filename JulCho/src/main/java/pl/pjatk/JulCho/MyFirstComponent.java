package pl.pjatk.JulCho;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class MyFirstComponent
{
    public MyFirstComponent(MySimplePojo mySimplePojo, List<String> defaultData, List<String> otherDefaultData, @Value("${my.custom.property}")String propertiesValue)
    {
        System.out.println("Hello from MyFirstComponent");
        System.out.println(defaultData);
        System.out.println(otherDefaultData);
        System.out.println(propertiesValue);
        System.out.println(mySimplePojo.GetValueFromProperties());
        System.out.println(mySimplePojo.GetRandomFromProperties());
        mySimplePojo.soutString();
    }

    public void HelloFromMethod()
    {
        System.out.println("Hello from MyFirstComponent.HelloFromMethod");
    }
}

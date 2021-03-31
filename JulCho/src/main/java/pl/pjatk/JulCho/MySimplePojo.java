package pl.pjatk.JulCho;

import org.springframework.beans.factory.annotation.Value;

public class MySimplePojo {
    private String someStringValue;
    @Value("${my.custom.property}")
    private String valueFromProperties;
    @Value("${my.custom.random:default random}")
    private String randomFromProperties;

    public MySimplePojo(String someStringValue)
    {
        this.someStringValue = someStringValue;
        System.out.println("Hello from constructor MySimplePojo");
    }

    public String getSomeStringValue()
    {
        return someStringValue;
    }

    public void setSomeStringValue(String someStringValue)
    {
        this.someStringValue = someStringValue;
    }

    public void soutString()
    {
        System.out.println(someStringValue);
    }

    public String GetValueFromProperties()
    {
        return valueFromProperties;
    }

    public String GetRandomFromProperties()
    {
        return randomFromProperties;
    }
}

package pl.pjatk.julcho;

public class Car {
    private String Model;
    private String Type;

    public Car() { }

    public Car(String model, String type)
    {
        this.Model = model;
        this.Type = type;
    }

    public String getModel()
    {
        return Model;
    }

    public String getType()
    {
        return Type;
    }

    public void setModel(String model)
    {
        this.Model = model;
    }

    public void setType(String type)
    {
        this.Type = type;
    }
}

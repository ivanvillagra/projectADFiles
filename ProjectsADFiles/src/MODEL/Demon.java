package MODEL;

import java.io.Serializable;

public class Demon implements Serializable {
    private String name;
    private String description;

    public Demon(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Demon(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Demon{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

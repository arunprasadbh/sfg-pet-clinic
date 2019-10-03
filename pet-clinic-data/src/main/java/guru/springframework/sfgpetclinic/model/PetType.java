package guru.springframework.sfgpetclinic.model;

/*
 * Created by arunabhamidipati on 02/10/2019
 */

public class PetType extends BaseEntity{

    private String name;

    public PetType() {
    }

    public PetType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

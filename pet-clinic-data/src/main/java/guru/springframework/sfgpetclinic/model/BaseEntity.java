package guru.springframework.sfgpetclinic.model;

/*
 * Created by arunabhamidipati on 03/10/2019
 */

import java.io.Serializable;

public class BaseEntity implements Serializable {

    public Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

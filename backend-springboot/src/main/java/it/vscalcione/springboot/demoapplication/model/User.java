package it.vscalcione.springboot.demoapplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    private Long id;


    private String firstName;
    private String lastName;
    private Date birthDay;
    private String email;
    private String password;
    private Instant created;
    private boolean enabled;
}

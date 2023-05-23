package shoecream.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @Column(name = "USER_ID")
    private Long id;

    private String password;

    private String name;

    private String email;

    private String phoneNumber;

    @Column(name = "CREATE_DT")
    private LocalDateTime createDt;

    @Column(name = "MODIFIED_DT")
    private LocalDateTime modifiedDt;
}

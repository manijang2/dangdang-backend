package shop.dangstargram.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idx;

    @Column(nullable = false, unique = true)
    private String id;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    private boolean activated;

    public User(String id, String password, String email) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.activated = true;
    }
}
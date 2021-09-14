package com.example.sample.domains;

import com.example.sample.dtos.UserNameDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.ScrollableResults;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor


@NamedNativeQuery(
        name = "User.findUserNameById",
        query = "SELECT first_name, last_Name FROM users WHERE id = :id",
        resultSetMapping = "findUserNameById"
)
@SqlResultSetMapping(
        name = "findUserNameById",
        classes = @ConstructorResult(
                targetClass = UserNameDto.class,
                columns = {
                        @ColumnResult(name = "first_name"),
                        @ColumnResult(name = "last_Name")
                }
        )
)


public class User {

    @Id
    @Column(name="id")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy ="uuid2")
    private String id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_Name")
    private String last_Name;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<Post> posts = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<Comment> comments = new HashSet<>();
}

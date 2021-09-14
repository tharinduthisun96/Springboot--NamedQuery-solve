package com.example.sample.domains;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="posts")
@Getter
@Setter
@NoArgsConstructor
public class Post {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="post_message")
    private String post_message;

    //private Set<User> user_id = new HashSet<>();
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

}

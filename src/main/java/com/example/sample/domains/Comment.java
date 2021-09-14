package com.example.sample.domains;

import javafx.geometry.Pos;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name="comments")
@Getter
@Setter
@NoArgsConstructor
public class Comment {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="message")
    private String message;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;


}

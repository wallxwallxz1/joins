package com.company.joins.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "post_comment")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@EqualsAndHashCode

public class PostComment implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private String review;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @Column()
//     private Post post;

}

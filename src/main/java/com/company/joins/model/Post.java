package com.company.joins.model;


import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Post")
@NoArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode

public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;

    @OneToMany  (cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "post_id" )  /*
    source: "https://vladmihalcea.com/the-best-way-to-map-a-onetomany-association-with-jpa-and-hibernate/"
    
                                        The @JoinColumn annotation helps Hibernate to figure out that
                                        there is a post_id Foreign Key column in the post_comment table
                                        that defines this association.
                                        N.B.
                                        You only use the annotation below for unidirectional @OneToMany
                                        association without creating corresponding @ManyToOne annotation
                                        on the postComment class.
                                         
                                         @OneToMany  (cascade = CascadeT
                                         @JoinColumn(name = "post_id" )
                                        */
   // private Set<PostComment> postComment = new HashSet <>();
    private List<PostComment> postComments = new ArrayList <>();
}

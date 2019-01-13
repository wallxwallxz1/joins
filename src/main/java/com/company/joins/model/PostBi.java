package com.company.joins.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import sun.swing.BakedArrayList;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "postBi")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@JsonIgnoreProperties
public class PostBi implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;

    @OneToMany(mappedBy = "postBi",
                /*
                * The @MappedBy by tell hibernate that the mapping will be performed
                * postBi class
                * */
                cascade = CascadeType.ALL,
                orphanRemoval = true
                )
    private List<PostCommentBi> postCommentBi = new ArrayList <>();

    public PostBi(String title, List <PostCommentBi> postCommentBi) {
        this.title = title;
        this.postCommentBi = postCommentBi;
    }
}

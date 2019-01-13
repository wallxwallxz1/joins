package com.company.joins.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "post_CommentBi")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PostCommentBi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String review;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postBi_id")
    /*
    * The @JoinColumn annotation helps Hibernate to figure out that
    * there is a postBi_id Foreign Key column in the post table
    * that defines this association.
    */
    private PostBi postBi;

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof PostComment))return false;
        return id != null && id.equals(((PostCommentBi)o).id);
    }

    @Override
    public int hashCode(){
        return 31;
    }

}

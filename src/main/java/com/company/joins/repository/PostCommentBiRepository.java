package com.company.joins.repository;

import com.company.joins.model.PostCommentBi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCommentBiRepository extends JpaRepository<PostCommentBi, Integer> {
}

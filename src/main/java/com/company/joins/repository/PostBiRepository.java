package com.company.joins.repository;

import com.company.joins.model.PostBi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;


@Repository
public interface PostBiRepository  extends JpaRepository<PostBi, Integer>, Serializable {
}

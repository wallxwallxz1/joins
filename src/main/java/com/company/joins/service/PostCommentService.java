package com.company.joins.service;

import com.company.joins.model.PostComment;
import com.company.joins.model.PostCommentBi;
import com.company.joins.repository.PostCommentBiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostCommentService {

    @Autowired
    private PostCommentBiRepository postCommentBiRepository;

    public void createComment(PostCommentBi comment){

        postCommentBiRepository.save(comment);
    }
}

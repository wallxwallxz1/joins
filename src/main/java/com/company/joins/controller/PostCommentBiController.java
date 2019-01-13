package com.company.joins.controller;

import com.company.joins.model.PostComment;
import com.company.joins.model.PostCommentBi;
import com.company.joins.repository.PostCommentBiRepository;
import com.company.joins.service.PostBiService;
import com.company.joins.service.PostCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class PostCommentBiController {

    @Autowired
    private PostCommentService postCommentService;

    @PostMapping(value = "/comment")
    public int createComment(@RequestBody PostCommentBi comment){

        postCommentService.createComment(comment);
        return 0;
    }

}

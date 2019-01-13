package com.company.joins.controller;

import com.company.joins.model.PostBi;
import com.company.joins.service.PostBiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class PostBiController {

    @Autowired
    PostBiService postBiService;

    @GetMapping(value = "/post", produces = {"application/Json"})
    @ResponseBody
    public List<PostBi> selectAll(){

        return postBiService.getAllPost();
    }

    @GetMapping(value = "post/{id}",produces = {"application/Json"})

    public Optional<PostBi> selectPostById(@PathVariable Integer id){

        return postBiService.getOnePost(id);
    }

    @PostMapping(value = "/post")
    public int createPost(@RequestBody @Valid PostBi post){

        postBiService.insertPost(post);
        return 0;
    }

    @PostMapping(value = "/posts")
    public int createMultiplePosts(@RequestBody PostBi[] posts){

        postBiService.insertArrayofPost(posts);
        return 0;
    }


    @PutMapping(value = "/post")
    public PostBi updatePost(@RequestBody @Valid PostBi post){

        return postBiService.updatePost(post);
    }


}

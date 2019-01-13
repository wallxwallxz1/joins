package com.company.joins.service;

import com.company.joins.model.PostBi;
import com.company.joins.repository.PostBiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PostBiService  {

    @Autowired
    PostBiRepository postBiRepository;

    public List<PostBi> getAllPost(){

        List<PostBi> list = new ArrayList <>();
       postBiRepository.findAll().forEach(list::add);

        return list;
    }

    public Optional<PostBi> getOnePost(Integer id){

        return postBiRepository.findById(id);
    }

    public void insertPost(PostBi post){


        postBiRepository.save(post);
       // postCommentBiRepository.save(post.getPostCommentBi());
    }


    public void insertArrayOfPost(PostBi[] posts){

        Arrays.stream(posts).forEach(p -> postBiRepository.save(p));

//        for (PostBi p:posts)
//        /* Alternative Method without Lambda above*/
//        {
//            postBiRepository.save(p);
//        }
    }

    public PostBi updatePost(PostBi post){

        return postBiRepository.save(post);
    }

    public void deletePost(Integer id){

        postBiRepository.deleteById(id);
    }


}

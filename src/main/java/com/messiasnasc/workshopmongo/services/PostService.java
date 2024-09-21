package com.messiasnasc.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messiasnasc.workshopmongo.domain.Post;
import com.messiasnasc.workshopmongo.repository.PostRepository;
import com.messiasnasc.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> user = repo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
    }
}



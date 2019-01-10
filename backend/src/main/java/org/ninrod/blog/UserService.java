package org.ninrod.blog;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    UserRepository repo;
    @Autowired
    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<Usuario> getUsers() {
        Iterable<Usuario> all = repo.findAll();
        List<Usuario> users = new ArrayList<>();
        all.forEach(users::add);
        return users;
    }
}
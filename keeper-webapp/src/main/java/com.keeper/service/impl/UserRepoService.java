package com.keeper.service.impl;

/*
 * Created by @GoodforGod on 9.04.2017.
 */

import com.keeper.entity.dao.User;
import com.keeper.repo.UserRepository;
import com.keeper.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Default Comment
 */
@Service
public class UserRepoService extends ModelRepoService<User> implements IUserService {

    private final UserRepository repository;

    @Autowired
    public UserRepoService(UserRepository repository) {
        this.repository = repository;
        this.primeRepository = repository;
    }

    @Override
    public boolean isExists(String email, String phone) {
        return (email != null && !email.isEmpty())
                ? repository.existsByEmail(email)
                : (phone != null && !phone.isEmpty()) && repository.existsByPhone(phone);
    }

    @Override
    public User get(String email, String phone) {
        return (email != null && !email.isEmpty())
                ? repository.findOneByEmail(email)
                : (phone != null && !phone.isEmpty()) ? repository.findOneByPhone(phone) : User.EMPTY;
    }

    @Override
    public User remove(String email, String phone) {
        return (email != null && !email.isEmpty())
                ? repository.removeByEmail(email)
                : (phone != null && !phone.isEmpty()) ? repository.removeByPhone(phone) : User.EMPTY;
    }
}